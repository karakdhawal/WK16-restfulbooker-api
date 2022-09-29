package com.herokuapp.restfulbooker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

import java.util.Random;

public class TestBase {
   @BeforeClass
    public static void inIt (){
       RestAssured.baseURI="https://restful-booker.herokuapp.com";
    //   RestAssured.basePath="/booking";
   }
}
