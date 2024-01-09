package tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = false;

    }

    //3.6.
    public boolean authenticate(String name, String password) {
        return false;
    }

}