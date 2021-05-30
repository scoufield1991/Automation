package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utils.Waiters;

public class ProductsPage extends AbstractPage {

    public ProductsPage() {
        super();
    }

    @FindBy(css = "[href$='/hair-care-panda-vegan-gummies']")
    private WebElement productGummies;

    @FindBy(css = "span [data-name=\"Hair Care Panda Vegan Gummies\"]")
    private WebElement buttonBuy;

    @FindBy(css = ".table-cart-small-footer > [href='/shopping-cart']")
    private WebElement buttonBasket;

    public WebElement checkProduct() {
        return productGummies;
    }

    public void moveToProduct(){
        Actions builder = new Actions(ProviderForDriver.INSTANCE.getDriver());
        builder.moveToElement(checkProduct()).perform();
    }

    public void clickBuy(){
        buttonBuy.click();
    }

    public BasketPage clickBasket(){
        Waiters.waitForElementToBeVisible(buttonBasket);
        buttonBasket.click();
        return new BasketPage();
    }

}
