package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhereToBuyPage extends AbstractPage {


    public WhereToBuyPage() {
        super();
        waitForLoadableElement();
    }

    @Override
    public void waitForLoadableElement() {

    }

    @FindBy(css = ".stores [name=\"locationName\"]")
    private WebElement searchElement;

    public void searchElement(){
        searchElement.click();
        searchElement.sendKeys("Eg. Sydney, NSW 2000");
    }

    @FindBy(css = ".stores [class=\"search-submit\"]")
    private WebElement buttonSubmit;

    public void clickButtonSubmit(){
        buttonSubmit.click();
    }

    @FindBy(css = ".results")
    private WebElement result;

    public WebElement result(){
        return result;
    }
}
