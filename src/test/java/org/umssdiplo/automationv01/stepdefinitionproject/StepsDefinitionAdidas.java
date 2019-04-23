package org.umssdiplo.automationv01.stepdefinitionproject;

import com.sun.org.apache.xpath.internal.operations.Bool;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.carritoPage.CarritoPage;
import org.umssdiplo.automationv01.core.managepage.dialog.CarritoDialog;
import org.umssdiplo.automationv01.core.managepage.home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionAdidas {
    private Home home;
    private String priceCalzado;
    private CarritoDialog carritoDialog;
    private CarritoPage carritoPage;

    @Given("^'Adidas Home page'  is loaded$")
    public void adidasHomePageIsLoaded() {
        home = LoadPage.homePage();
    }

    @And("^hover in 'Hombre option'$")
    public void hoverInHombreOption() {
        home.hoverHombreOption();
    }

    @And("^click in 'futbol option'$")
    public void clickInFutbolOption() {
        home.clickElement();
    }

    @And("^get price Calzado de Fútbol$")
    public void getPriceCalzadoDeFútbol() {
        priceCalzado = home.getPrice();
    }

    @And("^click in Calzado Futbol$")
    public void clickInCalzadoFutbol() {
        home.clickInSelectedShoes();
    }

    @And("^select \"([^\"]*)\" size$")
    public void selectSize(String selectedSize) throws Throwable {
        home.setSelectedSize(selectedSize);
    }

    @When("^click on 'Añadir al carrito' button$")
    public void clickOnAñadirAlCarritoButton() {
        carritoDialog = home.clickCarritoButton();
    }

    @Then("^verify cantidad es igual a \"([^\"]*)\"$")
    public void verifyCantidadEsIgualA(String expectedResult) throws Throwable {
        String actualResult = carritoDialog.getQuantity();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("^click on 'Ver Carrito' button$")
    public void clickOnVerCarritoButton() {
        carritoPage = carritoDialog.clickVerCarritoButton();
    }

    @Then("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String expextedTitle) throws Throwable {
        String currentTitle =  carritoPage.getTitle();
        Assert.assertEquals(currentTitle, expextedTitle);
    }

    @Then("^Verify price should be \"([^\"]*)\"$")
    public void verifyPriceShouldBe(String expectedPrice) throws Throwable {
        String currentPrice = carritoPage.getPrice();
        Assert.assertEquals(currentPrice, expectedPrice);
    }

    @Then("^Verify Total should be \"([^\"]*)\"$")
    public void verifyTotalShouldBe(String expectedTotal) throws Throwable {
        String currentTotal = carritoPage.getTotal();
        Assert.assertEquals(currentTotal, expectedTotal);
    }
}
