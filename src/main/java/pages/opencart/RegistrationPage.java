package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    private WebDriver driver;
    private WebElement webElement;

    @FindBy(id = "input-firstname")
    private WebElement firstName;
    @FindBy(id = "input-lastname")
    private WebElement lastName;
    @FindBy(id = "input-email")
    private WebElement emailAddress;
    @FindBy(id = "input-telephone")
    private WebElement telephone;
    @FindBy(id = "input-password")
    private WebElement ourPassword;
    @FindBy(id = "input-confirm")
    private WebElement passwordConfirm;
    @FindBy(xpath = "//form/div/div/input[1]")
    private WebElement privacyPolicy;
    @FindBy(xpath = "//form/div/div/input[2]")
    private WebElement continueButton;
    @FindBy(linkText = "Continue")
    private WebElement start;
    private int figure;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registerNewUser(String name, String surname, String email,
                                String phoneNumber, String password,
                                String confirmPassword) {
        firstName.click();
        firstName.clear();
        firstName.sendKeys(name);
        lastName.click();
        lastName.clear();
        lastName.sendKeys(surname);
        emailAddress.click();
        emailAddress.clear();
        emailAddress.sendKeys(email);
        telephone.click();
        telephone.clear();
        telephone.sendKeys(phoneNumber);
        ourPassword.click();
        ourPassword.clear();
        ourPassword.sendKeys(password);
        passwordConfirm.click();
        passwordConfirm.clear();
        passwordConfirm.sendKeys(confirmPassword);
        privacyPolicy.click();
        continueButton.click();
    }

    public void clickContinueButton() {
        start.click();
    }
}
