package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.*;
import pages.UserApi;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class UserApiTest {

    UserApi ua = new UserApi();

    @Test
    public void userDataTest() {
        given().contentType(ContentType.JSON)
                .when().get(ua.getUserApiPath())
                .then().statusCode(200)
                .body("login", equalTo(ua.getLogin()))
                .body("id", equalTo(ua.getId()));

        System.out.println("el id del user es: " + ua.getId());
        System.out.println("el login del user es: " + ua.getLogin());
    }

}



