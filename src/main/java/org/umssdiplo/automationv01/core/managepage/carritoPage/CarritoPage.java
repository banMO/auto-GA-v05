package org.umssdiplo.automationv01.core.managepage.carritoPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CarritoPage extends BasePage {
    @FindBy(xpath = "//div[@class='product']/a")
    private WebElement tituloElement;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement priceElement;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement totalElement;

    public String getTitle() {
        return CommonEvents.getTextContent(tituloElement).trim();
    }

    public String getPrice() {
        return CommonEvents.getTextContent(priceElement).trim();
    }

    public String getTotal() {
        return CommonEvents.getTextContent(totalElement).trim();
    }
}
