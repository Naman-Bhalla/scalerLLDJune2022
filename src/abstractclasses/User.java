package abstractclasses;

public abstract class User {
    private String name;
    private String email;
    private String password;

    private String userType;

    User(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract void saySomething();

    void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
