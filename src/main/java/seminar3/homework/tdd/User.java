package seminar3.homework.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isAuthenticate=" + isAuthenticate +
                '}';
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name == name && this.password == password) {
            return true;
        } else {
            return false;
        }
    }

}