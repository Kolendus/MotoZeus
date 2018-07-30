package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Motorcycle;
import model.User;

public class BaseConnection {

    Connection conn;
    private boolean isLogged;

    public BaseConnection() {
        connBegin();
    }

    public void queryOrder(Motorcycle motor, User username) {

        // create a sql date object so we can use it in our INSERT statement
        Calendar calendar = Calendar.getInstance();
        java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
        // the mysql insert statement
        String query = " insert into orders ( model,year,price,user)" + "values (?, ?, ?, ?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt;
        try {
            preparedStmt = conn.prepareStatement(query);

            preparedStmt.setString(1, motor.getName());
            preparedStmt.setInt(2, motor.getProductionYear());
            preparedStmt.setInt(3, motor.getPrice());
            preparedStmt.setString(4, username.getUsername());

            // execute the preparedstatement
            preparedStmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private boolean checkUser(User username) {
        try {
            String queryCheck = "SELECT username,email FROM users WHERE username = '" + username.getUsername() + "'" + " OR email = '" + username.getEmail() + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(queryCheck); // execute the query, and get a java resultset

            if (rs.first()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean saveUser(User username) {
        String query = "INSERT INTO users ( username,address,city,postcode,email,password)" + "VALUES (?,?,?,?,?,?)";

        PreparedStatement preparedStmt;
        if (checkUser(username)) {
            JOptionPane.showMessageDialog(new JFrame(), "User -> " + username.getUsername() + " or email " + username.getEmail() + " is already registered in database", "Database Users", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            preparedStmt = conn.prepareStatement(query);

            preparedStmt.setString(1, username.getUsername());
            preparedStmt.setString(2, username.getAddress());
            preparedStmt.setString(3, username.getCity());
            preparedStmt.setString(4, username.getPostCode());
            preparedStmt.setString(5, username.getEmail());
            preparedStmt.setString(6, username.getPassword());

            // execute the preparedstatement
            preparedStmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public User login(String username, String password) {
        try {
            Statement st = conn.createStatement();
            String foundName = null;
            String sql = "SELECT username FROM users WHERE username = '" + username + "'";
            ResultSet result = st.executeQuery(sql);
            result.next();
            foundName = result.getString("username");
            if (!checkString(foundName, username)) {
                JOptionPane.showMessageDialog(new JFrame(), " User " + username + " does not exists in our database", " Login", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            connClose();
            connBegin();
            Statement st2 = conn.createStatement();
            String sql2 = "SELECT * FROM users WHERE username = '" + username + "'";
            ResultSet result2 = st2.executeQuery(sql2);
            result2.next();

            String foundPassword = result2.getString("password");
            System.out.println(foundPassword + " other " + password);
            if (!checkString(foundPassword, password)) {
                JOptionPane.showMessageDialog(new JFrame(), "The password must be wrong", "Login", JOptionPane.ERROR_MESSAGE);
                return null;
            }

            String name = result2.getString("username");
            String address = result2.getString("address");
            String city = result2.getString("city");
            String postcode = result2.getString("postcode");
            String email = result2.getString("email");
            String pass = result2.getString("password");
            isLogged = true;
            return new User(name, pass, postcode, address, city, email);

        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(new JFrame(), "Please write your login and password in order to go shopping", "Information", JOptionPane.OK_OPTION);
        return null;
    }

    public boolean returnisLogged() {
        return isLogged;
    }

    private boolean checkString(String one, String two) {
        char[] found = one.toCharArray();
        char[] goal = two.toCharArray();
        if (found.length == goal.length) {
            for (int i = 0; i < found.length; i++) {
                if (found[i] != goal[i]) {
                    System.out.println("These Strings are not the same ones");
                }
            }
            return true;
        }
        return false;
    }

    public void connBegin() {
        /*JDBC mySQL driver*/
        String myDriver = "com.mysql.jdbc.Driver";
        /*URL to your local base*/
        String myUrl = "jdbc:mysql://localhost:3306/MotoZeus?useSSL=false";
        /*Name of the user with the access to the database*/
        String myName = "test";
        /*Password for the user*/
        String myPassword = "test";
        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.conn = DriverManager.getConnection(myUrl, myName, myPassword);
        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Could not connect to the Database. Probably wrong password inserted.");
        }
    }

    public void connClose() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
