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

    @FindBy(xpath = "/html/body/app-root/app-machineries/table/tbody/tr[3]/mat-cell/button[1]")
    private WebElement editIcon;

    @FindBy(xpath = "/html/body/app-root/app-machineries/table/tbody/tr[3]/mat-cell/button[2]")
    private WebElement deleteIcon;

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

    public MachineryDialog clickEditIcon(String descriptionValue) {
        CommonEvents.clickButton(editIcon);
        MachineryDialog currentCreateDialog = new MachineryDialog();
        currentCreateDialog.update(descriptionValue);
        return currentCreateDialog;
    }

    public void clickDeleteIcon() {
        CommonEvents.clickButton(deleteIcon);
    }
}
