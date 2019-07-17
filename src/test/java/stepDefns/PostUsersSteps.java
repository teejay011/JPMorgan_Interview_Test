package stepDefns;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;


public class PostUsersSteps {

    Response res = null;

    @Given("^I open the service url$")
     public void i_open_the_service_url() throws Throwable {
        System.out.println("OPENING SERVICE URL");
    }

    @When("^I make a post request to \"([^\"]*)\" endpoint with \"([^\"]*)\"$")
    public void i_make_a_post_request_to_endpoint(String postUser, String json) throws Throwable {
        res = given().contentType(ContentType.JSON).body(new File(json)).post(postUser);
        res.prettyPrint();
    }

    @Then("^I verify post is successful with status code \"([^\"]*)\"$")
    public void i_verify_post_is_successful_with_status_code(int statusCode) throws Throwable {
        res.then().statusCode(statusCode);
    }



}
