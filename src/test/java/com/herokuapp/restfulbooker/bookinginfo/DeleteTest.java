package com.herokuapp.restfulbooker.bookinginfo;

import com.herokuapp.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {
    @Test
    public void deleteBooking (){
        Response response = given()
                .pathParam("id", "115")
                .when()
                .delete("/{id}");
        response.then();//.statusCode(204);
        response.prettyPrint();
    }
}
