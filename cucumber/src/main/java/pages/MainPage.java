package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;

public class MainPage extends AbstractPage {

    public MainPage() {
        super();
    }

    @FindBy(css = "[onclick=\"setLocalCookie(); $('#cookiebar').hide();\"]")
    private WebElement cookieButton;

    @FindBy(css = "[href='/produkty/zelki']")
    private WebElement categoryGummies;

    @FindBy(css = "span [data-name=\"Hair Care Panda Pandastic Set\"]")
    private WebElement buttonBuyMain;

    @FindBy(css = ".table-cart-small-footer > [href='/shopping-cart']")
    private WebElement buttonBasket;

    public void clickCookieButton(){
        cookieButton.click();
    }

    public ProductsPage selectCategory() {
        categoryGummies.click();
        return new ProductsPage();
    }

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

    public BasketPage clickBasket(){
        Waiters.waitForElementToBeVisible(buttonBasket);
        buttonBasket.click();
        return new BasketPage();
    }

}
