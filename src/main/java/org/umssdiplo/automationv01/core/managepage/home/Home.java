package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.dialog.CarritoDialog;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {
    @FindBy(xpath="//a[@href='/hombre']")
    private WebElement hombreOption;

    @FindBy(xpath = "//a[@href='/calzado_de_futbol-hombre']")
    private  WebElement futbolOption;

    @FindBy(xpath = "//div[@title=\"Calzado de Fútbol X 18.3 TF\"]/following-sibling::div/span[1]")
    private WebElement costElement;

    @FindBy(xpath = "//div[@title=\"Calzado de Fútbol X 18.3 TF\"]")
    private WebElement selectedShoes;

    @FindBy(xpath= "//button[@title='Elige tu talla']")
    private WebElement selectElement;

    @FindBy(xpath = "//button[contains(text(), 'Añadir al carrito')]")
    private WebElement carritoElement;

    public Home clickElement() {
        CommonEvents.forceWait(300);
        CommonEvents.jsClickElement(futbolOption);
        return this;
    }

    public Home hoverHombreOption() {
        CommonEvents.hoverElement(hombreOption);
        CommonEvents.forceWait(300);
        return this;
    }

    public String getPrice() {
        return CommonEvents.getTextContent(costElement);
    }

    public void clickInSelectedShoes() {
        CommonEvents.jsClickElement(selectedShoes);
    }

    public Home setSelectedSize(String selectedSize) {
        CommonEvents.setSelectValue(selectElement, selectedSize);
        CommonEvents.forceWait(300);
        return this;
    }

    public CarritoDialog clickCarritoButton() {
        CommonEvents.clickButton(carritoElement);
        return new CarritoDialog();
    }
}
