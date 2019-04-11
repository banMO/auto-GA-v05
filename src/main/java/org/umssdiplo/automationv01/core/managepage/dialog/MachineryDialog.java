package org.umssdiplo.automationv01.core.managepage.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.Machinery;

public class MachineryDialog extends BasePage {
    @FindBy(xpath = "//mat-dialog-container")
    private WebElement containerDialog;

    @FindBy(name = "nombre")
    private WebElement nameField;

    @FindBy(name  = "descripcion")
    private WebElement descriptionField;

    @FindBy(name = "stock")
    private WebElement stockField;

    @FindBy(name = "model")
    private WebElement modelField;

    @FindBy(name = "brand")
    private WebElement brandField;

    @FindBy(name = "image")
    private WebElement imageField;

    @FindBy(name = "type")
    private WebElement typeField;

    @FindBy(name = "save")
    private WebElement saveButton;

    public MachineryDialog() {
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void setAllFields(Machinery machinery) {
        CommonEvents.setInputField(nameField, machinery.getName());
        CommonEvents.setInputField(descriptionField, machinery.getDescription());
        CommonEvents.setInputField(stockField, machinery.getStock());
        CommonEvents.setInputField(modelField, machinery.getModelo());
        CommonEvents.setInputField(brandField, machinery.getMarca());
        imageField.sendKeys(machinery.getImage());
        CommonEvents.setSelectValue(typeField, machinery.getType());
        CommonEvents.clickButton(saveButton);
    }
}
