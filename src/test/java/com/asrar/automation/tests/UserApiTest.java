package com.asrar.automation.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @Test
    public void verifyUserDetails() {

        baseURI = "https://dummyjson.com";

        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("firstName", equalTo("Emily"));
    }
}
