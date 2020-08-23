package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "input-email")
    private WebElement emailField;
    @FindBy(id = "input-password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@value='Login']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void loginAs(String email, String password) {
        emailField.click();
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(password);
        clickLogin();
    }
}