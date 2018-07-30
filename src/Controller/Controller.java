package Controller;

import Database.BaseConnection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Model;
import model.Motorcycle;
import model.User;

public class Controller {

    private final Model theModel;
    private final BaseConnection sql = new BaseConnection();

    public Controller() {
        theModel = new Model();
    }

    public Motorcycle findMotorcycle(String name) {
        Motorcycle motor = theModel.findMotorcycle(name);
        return motor;
    }

    private void sendMail(User username, Motorcycle motor) {
        String path = theModel.createPDF(username, motor);
        theModel.sendMail(username.getEmail(), path);
    }

    public User createUser(String username, String password, String address, String postcode, String city, String email) {
        User nowy = new User(username, password, postcode, address, city, email);
        if (checkRegisterData(address, username, password, postcode, city, email) == true) {
            if (sql.saveUser(nowy) == true) {
                return nowy;
            }
        }
        return null;

    }

    public boolean isLogged() {
        return sql.returnisLogged();
    }

    public void connClose() {
        sql.connClose();
    }

    public User loginUser(String username, String password) {
        return sql.login(username, password);
    }

    public void queryOrder(Motorcycle motor, User username) {
        sql.queryOrder(motor, username);
        sendMail(username, motor);
    }

    public ArrayList<String> techData(String name) {
        return theModel.techData(name);
    }

    public boolean checkMail(String mail) {
        char ch;
        boolean hasMonkey = false;
        boolean validMail = false;
        for (int i = 0; i < mail.length(); i++) {
            ch = mail.charAt(i);
            if (ch == '@') {
                hasMonkey = true;
            }
        }
        if (mail.contains("gmail.com") || mail.contains("yahoo.com") || mail.contains("outlook.com") || mail.contains("wp.pl")) {
            validMail = true;
        }
        if (hasMonkey == true && validMail == true) {
            return true;
        }
        return false;
    }

    public boolean checkPostcode(String postcode) {
        char ch;
        boolean isDigit = true;
        ch = postcode.charAt(2);
        System.out.println(ch);
        if ((ch = postcode.charAt(2)) != '-') {
            return false;
        }
        for (int i = 0; i < postcode.length(); i++) {
            ch = postcode.charAt(i);
            if (i == 2)
                ; else if (!Character.isDigit(ch)) {
                isDigit = false;
                return false;
            }
        }
        return true;
    }

    public boolean checkPassword(String password) {
        boolean capitalLetter = false;
        boolean lowerLetter = false;
        boolean digitLetter = false;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitLetter = true;
            } else if (Character.isUpperCase(ch)) {
                capitalLetter = true;
            } else if (Character.isLowerCase(ch)) {
                lowerLetter = true;
            }
        }
        if ((capitalLetter && lowerLetter && digitLetter) == true) {
            return true;
        }

        return false;
    }

    public boolean checkRegisterData(String address, String username, String password, String postcode, String city, String mail) {

        if (address.length() < 5) {
            JOptionPane.showMessageDialog(new JFrame(), "Please write your correct address. Incorrect one will result in wrong delivery", "Data input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (username.length() < 4) {
            JOptionPane.showMessageDialog(new JFrame(), "Please put username (at least four characters) ", "Username input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!checkPassword(password)) {
            JOptionPane.showMessageDialog(new JFrame(), "Password must meet these requirements : +"
                    + "Must contain 8 characters.Must contain 1 lower case letter."
                    + "Must contain 1 upper case letter.Must contain 1 numeric digit.", "Password input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!checkPostcode(postcode)) {
            JOptionPane.showMessageDialog(new JFrame(), " Post Code must be in from like .: \"15-156\" ", "PostCode input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (city.length() < 4) {
            JOptionPane.showMessageDialog(new JFrame(), "Please input an existing city", "City input", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!checkMail(mail)) {
            JOptionPane.showMessageDialog(new JFrame(), "Please put your real e-mail address", "Mail input", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public void startCreatingMotorcycles() {
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\YamahaR6.jpg"), 2012, "Rzędowy czterocylindrowy", 599, 20, 188, 120, "Yamaha YZF-R6", 25000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\KawasakiZX6R.jpg"), 2014, "Rzędowy czterocylindrowy", 636, 17, 194, 131, "Kawasaki Ninja ZX-6R 636", 789789);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Kawasaki H2.jpg"), 2017, "Czterocylindrowy,Czterosuwowy", 998, 19, 238, 210, "Kawasaki H2", 1230000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\BMW S1000RR.jpg"), 2015, "Czterosuwowy, chłodzony cieczą", 1000, (int) 17.5, 204, 199, "BMW S1000RR", 75000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\KTM SX 250.jpg"), 2008, "Jednocylindrowy", 250, 9, 40, 95, "KTM SX 250", 23000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Kawasaki KLX 250.jpg"), 2010, "Jednocylindrowy", 250, 8, 22, 138, "Kawasaki KLX 250", 28000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Aprilia SX 125.jpg"), 2009, "Jednocylindrowy", 125, 7, 21, 115, "Aprilia SX 125", 17500);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Yamaha DT 125.jpg"), 2008, "Jednocylindrowy", 125, 12, 10, 91, "Yamaha DT 125", 15000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Yamaha Virago 535.jpg"), 2008, "Czterosuwowy, chłodzony powietrzem", 535, 46, 9, 197, "Yamaha Virago 535", 18000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Suzuki intruder 800.jpg"), 2011, "Czterosuwowy, chłodzony chłodnicą", 800, 46, 9, 197, "Suzuki Intruder 800", 21000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Kawasaki Vulcan 800.jpg"), 2013, "Czterosuwowy, chłodzony powietrzem", 800, 55, 13, 425, "Kawasaki Vulcan 800", 24000);
        theModel.createMotorcycle(theModel.loadImage("src\\resources\\Motorcycle Photos\\Harley-Davidson 883.jpg"), 2003, "Widlasty, chłodzony powietrzem", 883, 53, 12, 255, "Harley-Davidson 883", 32000);
    }

    public ImageIcon scaleIcon(Motorcycle motor) {
        return theModel.scaleIcon(motor);
    }

}
