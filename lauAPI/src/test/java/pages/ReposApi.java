package pages;

public class ReposApi {

    private String repoApiPath = "https://api.github.com/users/laujorge/repos";
    private String repoToDelete = "https://api.github.com/users/laujorge/repos/GitApiTests";
    private String repoEditPath = "https://api.github.com/repos/LauJorge/Hello-World";
    private String name;

    public String getRepoEditPath() {
        return repoEditPath;
    }

    public void setRepoEditPath(String repoEditPath) {
        this.repoEditPath = repoEditPath;
    }

    public String getRepoBody() {
        return repoBody;
    }

    public void setRepoBody(String repoBody) {
        this.repoBody = repoBody;
    }

    private String repoBody = "{" +
            "\"name\": \"dogoo\"," +
            "\"description\": \"my repo description\"," +
            "\"homepage\": \"https://github.com\"," +
            "\"private\": false," +
            "\"has_issues\": true," +
            "\"has_projects\": true," +
            "\"has_wiki\": true " +
            "}";

    private int id;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepoApiPath() {
        return repoApiPath;
    }

    public void setRepoApiPath(String repoApiPath) {
        this.repoApiPath = repoApiPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepoToDelete() {
        return repoToDelete;
    }

    public void setRepoToDelete(String repoToDelete) {
        this.repoToDelete = repoToDelete;
    }


}

