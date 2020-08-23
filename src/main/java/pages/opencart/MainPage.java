package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    private static final String BASE_URL = "https://demo.opencart.com/";
    private static final String ACCOUNT_LINK = "My Account";
    private static final String LOGIN_LINK = "Login";
    private static final String REGISTER_LINK = "Register";
    private static final String LOGOUT_LINK = "Logout";

    private WebDriver driver;

    @FindBy(linkText = ACCOUNT_LINK)
    private WebElement myAccountField;
    @FindBy(linkText = LOGIN_LINK)
    private WebElement loginField;
    @FindBy(linkText = REGISTER_LINK)
    private WebElement registerField;
    @FindBy(linkText = LOGOUT_LINK)
    private WebElement logoutField;
    @FindBy(linkText = "Continue")
    private WebElement start;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void findMyAccount() {
        myAccountField.click();
    }

    public void findLogin() {
        loginField.click();
    }

    public void findRegister() {
        registerField.click();
    }

    public void logout(){
        findMyAccount();
        logoutField.click();
    }

    public void clickContinueButton(){
        start.click();
    }

}
