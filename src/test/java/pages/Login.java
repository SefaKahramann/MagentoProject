package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.GWD;

public class Login extends ParentPage {
        public Login() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Sign In")
    public WebElement signInLink;

    @FindBy(xpath = "//span[text()='Customer Login']")
    public WebElement customerLogin;

    @FindBy(name = "login[username]")
    public WebElement emailBox;

    @FindBy(name = "login[password]")
    public WebElement passwordBox;

    @FindBy(xpath = "(//div[@class='primary']/button)[1]")
    public WebElement signInButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement myAccountText;

    @FindBy(xpath = "//div[@class='box-content']/p")
    public WebElement accountDetails;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement logoClick;

    @FindBy(xpath = "(//span[contains(text(),'Welcome')])[1]")
    public WebElement welcomeText;

    @FindBy(xpath = "//a[@class='action remind']/span")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement forgetPasswordText;

    @FindBy(xpath = "//div[contains(text(),'Please enter your email address')]")
    public WebElement forgotPasswordConfirmText;
}
