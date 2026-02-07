package com.asrar.automation.tests;

import com.asrar.automation.base.BaseTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AuthApiTest extends BaseTest {

    @Test
    public void verifyLogin() {

        String requestBody = "{\n" +
                "  \"username\": \"emilys\",\n" +
                "  \"password\": \"emilyspass\"\n" +
                "}";


        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
            .when()
                .post("/auth/login")
            .then()
                .statusCode(200)
                .body("accesstoken", notNullValue());
    }
}
