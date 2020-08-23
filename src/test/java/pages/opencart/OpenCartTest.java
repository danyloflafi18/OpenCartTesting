package pages.opencart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Test;
public class OpenCartTest {
    @Test
    public void testOpenCart() throws Exception {
        //Init chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        new RegistrationPage(driver);
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        new RegistrationPage(driver);
        //OpenCartMainPage mainPage = new OpenCartMainPage(driver);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        new LoginPage(driver);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
        new CartPage(driver);

        mainPage.open();
        try {
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mainPage.findMyAccount();
        mainPage.findRegister();
        registrationPage.registerNewUser("Danylo", "Chalyi",
                "iotiot88@gmail.com", "0987654321", "drakondrakon",
                "drakondrakon");
        registrationPage.clickContinueButton();
        mainPage.logout();
        mainPage.clickContinueButton();
        mainPage.findMyAccount();
        mainPage.findLogin();
        loginPage.loginAs("iotiot8@gmail.com", "drakondrakon");
        cartPage.findSearch();
        cartPage.search("mac");
        cartPage.findGood();
        cartPage.addToCart();
    }
}
