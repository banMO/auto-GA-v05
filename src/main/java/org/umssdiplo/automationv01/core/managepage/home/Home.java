package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
//    @FindBy(xpath = "//span[@id='maquinaria']")
    @FindBy(name = "maquinaria")
    private WebElement machineriesOption;

    @FindBy(name = "listam")
    private WebElement listOption;

    public void clickMachineriesOption() {
        CommonEvents.jsClickElement(machineriesOption);
    }

    public void clickMachineriesListOption() {
        CommonEvents.jsClickElement(listOption);
    }
}
