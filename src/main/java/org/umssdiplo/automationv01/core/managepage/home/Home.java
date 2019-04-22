package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
    @FindBy(xpath="//a[@href='/hombre']")
    private WebElement hombreOption;

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private  WebElement futbolOption;

    public void clickHomeOption() {
        CommonEvents.hoverElement(hombreOption);
    }

    public void clickElement() {
        CommonEvents.jsClickElement(futbolOption);
    }
}
