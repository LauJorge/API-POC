package tests;

import io.restassured.http.ContentType;
import org.junit.*;
import pages.ReposApi;
import pages.UserApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ReposApiTest {

    ReposApi ra = new ReposApi();
    UserApi ua = new UserApi();

    @Test
    public void getDataFromReposTest() {
        given().contentType(ContentType.JSON).
                auth().oauth2(ua.getToken()).
                when().get(ra.getRepoApiPath()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
    }

    @Test
    public void getReposNameTest() {
        given().contentType(ContentType.JSON).
                auth().oauth2(ua.getToken()).
                when().get(ra.getRepoApiPath()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
                body("name[0]", equalTo("dogoo"));
    }

    @Test
    public void deleteRepoTest() {
        given().contentType(ContentType.JSON).
                auth().oauth2(ua.getToken()).
                when().delete("https://api.github.com/users/laujorge/repos/GitApiTests").
                then().assertThat().statusCode(204).and().
                body("status", equalTo("OK"));
    }

    @Test
    public void editRepoTest() {
        given().contentType(ContentType.JSON).
                auth().oauth2(ua.getToken()).
                body(ra.getRepoBody()).
                when().post(ra.getRepoEditPath()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON);
    }

}