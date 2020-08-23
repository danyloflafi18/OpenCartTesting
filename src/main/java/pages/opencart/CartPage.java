package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    private WebDriver driver;

    @FindBy(xpath = "//div/div/div[2]/div/input")
    private WebElement fieldSearch;
    @FindBy(xpath = "//div[2]/div/span/button")
    private WebElement searchGood;
    @FindBy(linkText = "MacBook Air")
    private WebElement ourGood;
    @FindBy(id = "button-cart")
    private WebElement addToCart;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findSearch(){
        fieldSearch.click();
    }
    public void search(String good){
        findSearch();
        fieldSearch.clear();
        fieldSearch.sendKeys(good);
        searchGood.click();
    }

    public void findGood(){
        ourGood.click();
    }
    public void addToCart(){
        addToCart.click();
    }
}

