package com.herokuapp.restfulbooker.bookinginfo;

import com.herokuapp.restfulbooker.model.BookingPojo;
import com.herokuapp.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostTest extends TestBase {

    @Test
    public void createBooking (){

        HashMap<String, Object> booking = new HashMap<>();
        booking.put("checkin", "2022-09-01");
        booking.put("checkout", "2022-09-10");


        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstName("lord1");
        bookingPojo.setLastName("uk1");
        bookingPojo.setTotalPrice(120);
        bookingPojo.setDepositPaid(false);
        bookingPojo.setBookingdates(booking);
        bookingPojo.setAdditionalNeeds("dinner1");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then();//.statusCode(200);
        response.prettyPrint();

    }
}
