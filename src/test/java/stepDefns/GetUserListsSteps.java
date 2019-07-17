package stepDefns;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;


import java.util.List;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class GetUserListsSteps {

    Response res = null;

    @Given("^I make GET request to \"([^\"]*)\" endpoint$")
    public void i_make_GET_request_to_endpoint(String users) throws Throwable {
        res = given().when().get(users);
        System.out.println(res.body().prettyPrint());
    }

    @When("^I receive response status$")
    public void i_receive_response_status() throws Throwable {
        res.then().statusCode(200);
        System.out.println(res.statusCode());
    }

    @Then("^I verify response contains \"([^\"]*)\" users$")
    public void i_verify_response_contains_users(int userList) throws Throwable {
        res.then().assertThat().body("id", hasSize(userList));
        List<String> usersList = res.jsonPath().getList("id");
        Assert.assertEquals("user list number should match", 10, userList);
        System.out.println(usersList);
    }
}
