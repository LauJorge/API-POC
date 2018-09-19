package pages;

public class UserApi {
    protected String userApiPath = "https://api.github.com/users/laujorge";
    protected String login = "LauJorge";
    protected int id = 27926310;
    private String token = "a7ca76dc1436ef4b682674609be63b6a86a61665";

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    public String getUserApiPath() {
        return userApiPath;
    }

    public void setUserApiPath(String userApiPath) {
        this.userApiPath = userApiPath;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
