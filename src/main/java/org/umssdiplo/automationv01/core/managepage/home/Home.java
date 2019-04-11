package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialog.MachineryDialog;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.Machinery;

public class Home extends BasePage {
    @FindBy(name = "maquinaria")
    private WebElement machineriesOption;

    @FindBy(name = "listam")
    private WebElement listOption;

    @FindBy(name="addm")
    private WebElement plusIcon;

    public void clickMachineriesOption() {
        CommonEvents.jsClickElement(machineriesOption);
    }

    public void clickMachineriesListOption() {
        CommonEvents.jsClickElement(listOption);
    }

    public MachineryDialog showMachineryForm() {
        CommonEvents.clickButton(plusIcon);;
        return new MachineryDialog();
    }

    public MachineryDialog setAllFields(Machinery machinery) {
        CommonEvents.clickButton(plusIcon);
        MachineryDialog currentCreateDialog = new MachineryDialog();
        currentCreateDialog.setAllFields(machinery);
        return currentCreateDialog;
    }
}
