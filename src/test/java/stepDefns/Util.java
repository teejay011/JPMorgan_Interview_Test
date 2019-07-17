package stepDefns;

import cucumber.api.java.Before;
import io.restassured.RestAssured;


public class Util {

    @Before
    public static void init() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
