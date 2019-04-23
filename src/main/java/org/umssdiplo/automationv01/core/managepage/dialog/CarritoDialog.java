package org.umssdiplo.automationv01.core.managepage.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.carritoPage.CarritoPage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarritoDialog extends BasePage {
    @FindBy(xpath = "//div[@role='dialog']")
    private WebElement container;

    @FindBy(xpath = "//div[@role='dialog']//span[contains(text(), 'Cantidad')]")
    private WebElement cantidad;

    @FindBy(xpath = "//button[contains(text(), 'ver carrito')]")
    private WebElement verCarritoElement;

    public CarritoDialog() {
        CommonEvents.waitMenuVisible(container);
    }

    public String getQuantity() {
        String cantidadValue = CommonEvents.getTextContent(cantidad).split(":")[1];
        return cantidadValue.trim();
    }

    public CarritoPage clickVerCarritoButton() {
        CommonEvents.jsClickElement(verCarritoElement);
        return new CarritoPage();
    }
}
