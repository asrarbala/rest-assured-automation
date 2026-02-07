package com.asrar.automation.tests;

import com.asrar.automation.base.BaseTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest extends BaseTest {

    @Test
    public void verifyUserDetails() {

        given()
                .when()
                .get("/users/1")
                .then()
                .statusCode(200)
                .body("firstName", equalTo("Emily"));
    }
}
