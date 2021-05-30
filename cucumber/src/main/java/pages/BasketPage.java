package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;

public class BasketPage extends AbstractPage{

    public BasketPage() {
        super();
    }

    @FindBy(css = "h1 >strong")
    private WebElement basket;

    public WebElement checkBasket(){
        return basket;
    }

    @FindBy(css = "[class=\"text-center biger-text hidden-xs\"] [class=\"delete\"]")
    private WebElement buttonDelete;

    public void deleteFromBasket(){
        Waiters.waitForElementToBeVisible(buttonDelete);
        buttonDelete.click();
    }

    @FindBy(css ="[class=\"col-auto text-center\"] [class=\"px20\"]")
    private WebElement emptyCart;

    public String emptyCartText(){
        return emptyCart.getText();
    }

    @FindBy(css = "[src=\"/img/sad-panda.png\"]")
    private WebElement sadPanda;

    public WebElement emptySadCart(){
        return sadPanda;
    }

    @FindBy(css = "[class=\"plus\"]")
    private WebElement elementPlus;

    public void cartElementPlus(){
        elementPlus.click();
    }

    /*@FindBy(css = ".quantity-box [value=\"2\"]")
    private WebElement quantity;

    public WebElement checkQuantity(){
        return quantity;
    }*/

    @FindBy(css = "[class=\"counter\"]")
    private WebElement counter;

    public String checkCounter(){
        Waiters.waitForElementToBeVisible(counter);
        return counter.getText();
    }

    @FindBy(css = "[class=\"text-center pull-right\"] [class=\"hidden-xs\"]")
    private WebElement price;

    public String increasePrice(){
        Waiters.waitForElementToBeVisible(price);
        return price.getText();
    }

}
