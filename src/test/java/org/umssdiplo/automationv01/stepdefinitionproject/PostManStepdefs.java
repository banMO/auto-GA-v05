package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

import static org.testng.Assert.assertEquals;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;
    private Home home;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        assertEquals(response.getStatusCode(), statusCode);
    }

//    @Then("^the responde 'data' value is \"([^\"]*)\"$")
//    public void theRespondeDataValueIs(String esperado) throws Throwable {
//        String actual = response.getDataValue();
//
//        Assert.assertEquals(esperado, actual);
//    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured$")
    public void postPostmanEndpointIsConfigured(String arg0) throws Throwable {

    }

    @Given("^'Puma Home' page is loaded$")
    public void pumaHomePageIsLoaded() {
        home = LoadPage.homePage();
    }

    @And("^click on 'Hombre option'$")
    public void clickOnHombreOption() {
        home.clickHomeOption();
    }

    @And("^click on 'futbol' option$")
    public void clickOnFutbolOption() {
        home.clickElement();
    }
}
