package com.herokuapp.restfulbooker.bookinginfo;

import com.herokuapp.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetTest extends TestBase {

    @Test
    public void getAllBookings (){
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void singleBooking (){
        Response response = given()
                .pathParam("id", "32")
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void deletedIdCheck (){
        Response response = given()
                .pathParam("id", "115")
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
