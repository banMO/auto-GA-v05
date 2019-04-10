package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.home.Home;
import org.umssdiplo.automationv01.core.utils.HomePage;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionMachineriesStore {
    private Home home;

    @Given("^'Machineries Page' page is loaded$")
    public void machineriesPageIsLoaded() throws Throwable{
        home = HomePage.homePage();
    }

    @And("^redirect to 'Machinery' page$")
    public void redirectToMachineryPage() {
        home.clickMachineriesOption();
    }

    @And("^redirect to 'Machineries list' page$")
    public void redirectToMachineriesListPage() {
        home.clickMachineriesListOption();
    }
}
