package com.herokuapp.restfulbooker.bookinginfo;

import com.herokuapp.restfulbooker.model.BookingPojo;
import com.herokuapp.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchTest extends TestBase {

    @Test
    public void updateBooking (){
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("lordpatch");
        bookingPojo.setLastName("uk");

        Response response = given()
                .header("Content-Type", "application/json")
                //.header("token","d025ba83a7fc136" )
//                .header("Cookie", "token=")
                .header("Authorisation", "d025ba83a7fc136")
                .body(bookingPojo)
                .when()
                .patch("/booking/115");
        response.then();
        response.prettyPrint();


    }

}
