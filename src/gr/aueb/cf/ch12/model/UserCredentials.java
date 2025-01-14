package gr.aueb.cf.ch12.model;

public class UserCredentials {
    private long id;
    private String username;
    private String password;

    public UserCredentials(String username, String password, long id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public UserCredentials(){

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}