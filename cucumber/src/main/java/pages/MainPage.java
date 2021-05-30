package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;

public class MainPage extends AbstractPage {

    public MainPage() {
        super();
    }

    @FindBy(css = "div [class =\"col-12 col-sm-3 btn-wrap\"] >button")
    private WebElement cookieButton;

    public void clickCookieButton(){
        cookieButton.click();
    }

    @FindBy(css = "[href='/produkty/zelki']")
    private WebElement categoryGummies;

    public ProductsPage selectCategory() {
        categoryGummies.click();
        return new ProductsPage();
    }

    @FindBy(css = "span [data-name=\"Hair Care Panda Pandastic Set\"]")
    private WebElement buttonBuyMain;

    public WebElement checkMainProduct() {
        return buttonBuyMain;
    }

    public void moveMainToProduct(){
        Actions builder = new Actions(ProviderForDriver.INSTANCE.getDriver());
        builder.moveToElement(checkMainProduct()).perform();
    }

    public void addProductToBasket(){
        buttonBuyMain.click();
    }

    @FindBy(css = "[class=\"btn btn-primary btn-rounded-smaller no-animation\"]")
    private WebElement buttonBasket;

    public BasketPage clickBasket(){
        Waiters.waitForElementToBeVisible(buttonBasket);
        buttonBasket.click();
        return new BasketPage();
    }

}
