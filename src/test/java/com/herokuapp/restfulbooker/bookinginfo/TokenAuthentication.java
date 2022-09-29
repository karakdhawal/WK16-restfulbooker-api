package com.herokuapp.restfulbooker.bookinginfo;

import com.herokuapp.restfulbooker.model.Token;
import com.herokuapp.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TokenAuthentication extends TestBase {
    @Test
    public void generateToken (){
        Token token = new Token();
        token.setUsername("admin");
        token.setPassword("password123");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(token)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
