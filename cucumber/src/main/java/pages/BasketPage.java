package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waiters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasketPage extends AbstractPage{

    public BasketPage() {
        super();
    }

    @FindBy(css = "h1 >strong")
    private WebElement basket;

    @FindBy(css = "[class=\"text-center biger-text hidden-xs\"] [class=\"delete\"]")
    private WebElement buttonDelete;

    @FindBy(css ="[class=\"col-auto text-center\"] [class=\"px20\"]")
    private WebElement emptyCart;

    @FindBy(css = "[src=\"/img/sad-panda.png\"]")
    private WebElement sadPanda;

    @FindBy(css = "[class=\"plus\"]")
    private WebElement elementPlus;

    @FindBy(css = "[class=\"counter\"]")
    private WebElement counter;

    @FindBy(css = "[class=\"text-center pull-right\"] [class=\"hidden-xs\"]")
    private WebElement price;

    public WebElement checkBasket(){
        return basket;
    }

    public void deleteFromBasket(){
        Waiters.waitForElementToBeVisible(buttonDelete);
        buttonDelete.click();
    }

    public String emptyCartText(){
        return emptyCart.getText();
    }

    public WebElement emptySadCart(){
        return sadPanda;
    }

    public void cartElementPlus(){
        elementPlus.click();
    }

    public String checkCounter(){
        return counter.getText();
    }

    public String increasePrice(){
        return price.getText();
    }

    public void checkCount(){
        Waiters.waitForElementToBe(counter,"2");
    }

}
