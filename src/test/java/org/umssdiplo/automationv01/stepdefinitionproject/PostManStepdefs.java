package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(response.getStatusCode(), statusCode);
    }

    @Then("^the response 'data' value is \"([^\"]*)\"$")
    public void theResponseDataValueIs(String expectedResult) throws Throwable {
        JsonPath responseJson = response.jsonPath();
        String currentResult = responseJson.get("data");
        Assert.assertEquals(expectedResult, currentResult);
    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured with this body \"([^\"]*)\"$")
    public void postPostmanEndpointIsConfiguredWithThisBody(String resourceEndpoint, String databody) throws Throwable {
        response = HandleRequest.post(resourceEndpoint, databody);
    }
}
