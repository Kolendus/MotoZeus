package model;

public class User {

    private String username;
    private String password;
    private String postCode;
    private String address;
    private String city;
    private String email;

    public User(String username, String password, String postCode, String address, String city, String email) {
        this.username = username;
        this.password = password;
        this.postCode = postCode;
        this.address = address;
        this.city = city;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }
}
