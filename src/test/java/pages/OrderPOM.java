package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

import java.util.List;

public class OrderPOM extends ParentPage{
    public OrderPOM() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "li[class='product-item'] a[class='product-item-link']")
    public List<WebElement> products;

    @FindBy(css = "[aria-describedby='option-label-size-143']")
    public List<WebElement> sizeList;

    @FindBy(css = "div[class='swatch-option color']")
    public List<WebElement> colorList;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCard;

    @FindBy(linkText = "shopping cart")
    public WebElement shoppingCart;

    @FindBy(css = "[class='input-text qty']")
    public WebElement inputQuantity;

    @FindBy(css = "[data-role='proceed-to-checkout']")
    public WebElement proceedToCheckoutBtn;

    @FindBy(css = "[class='shipping-address-item selected-item']")
    public WebElement shippingAddressControl;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement shippingMethods;

    @FindBy(css = "[data-role='opc-continue']")
    public WebElement nextBtn;

    @FindBy(css = "[class='billing-address-details']")
    public WebElement addressControl;

    @FindBy(name = "billing-address-same-as-shipping")
    public WebElement checkbox;

    @FindBy(css = "[class='action primary checkout']")
    public WebElement placeOrderBtn;

    @FindBy(css = "[class='base']")
    public WebElement orderMsg;

    public WebElement getWebElement(String strWebElement){
        switch (strWebElement){
            case "proceedToCheckout":
                return this.proceedToCheckoutBtn;
            case "nextButton":
                return this.nextBtn;
            case "checkbox":
                return this.checkbox;
            case "placeOrder":
                return this.placeOrderBtn;
            case "addToCart":
                return this.addToCard;
            case "shoppingCart":
                return this.shoppingCart;
        }
        return null;
    }
}
