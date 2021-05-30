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

    public WebElement checkProduct() {
        return productGummies;
    }

    public void moveToProduct(){
        Actions builder = new Actions(ProviderForDriver.INSTANCE.getDriver());
        builder.moveToElement(checkProduct()).perform();
    }

    @FindBy(css = "span [data-name=\"Hair Care Panda Vegan Gummies\"]")
    private WebElement buttonBuy;

    public void clickBuy(){
        buttonBuy.click();
    }

    @FindBy(css = "[class=\"btn btn-primary btn-rounded-smaller no-animation\"]")
    private WebElement buttonBasket;

    public BasketPage clickBasket(){
        Waiters.waitForElementToBeVisible(buttonBasket);
        buttonBasket.click();
        return new BasketPage();
    }

}
