package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.umssdiplo.automationv01.core.managepage.home.Home;
import org.umssdiplo.automationv01.core.utils.HomePage;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.Machinery;

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

    @And("^show 'Machinery form' page$")
    public void showMachineryFormPage() {
        home.showMachineryForm();
    }

    @And("^fill \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" nombre maquinaria campo en 'set all fields'$")
    public void fillNombreMaquinariaCampoEnSetAllFields(String name, String description, String stock, String modelo, String marca, String type, String image, String category) {
        Machinery machinery = new Machinery(name, description,  stock, modelo, marca, type, image, category);
        home.setAllFields(machinery);
    }

    @And("^'deleteMachinary' of tha machinaries list$")
    public void deletemachinaryOfThaMachinariesList() {
        home.clickDeleteIcon();
    }

    @And("^fill \"([^\"]*)\" click on 'edit button' and edit the description with$")
    public void fillClickOnEditButtonAndEditTheDescriptionWith(String description) {

    }
}
