package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;

public class WelcomePage extends AbstractPage {

    public WelcomePage(WebDriver driver) {
        super();
        waitForLoadableElement();
    }

    @Override
    public void waitForLoadableElement() {

    }

    @FindBy(css = "[for=\"confirm\"]")
    private WebElement confirm;

    public String getWarningText(){
                return confirm.getText();
    }

    @FindBy(css = "[for=\"confirm\"]")
    private WebElement checkbox;

    public WebElement getCheckbox(){
        return checkbox;
    }

    @FindBy(css = ".agegate-selector-options")
    private WebElement dropdown;

    public WebElement getDropdown(){
        return dropdown;
    }

    @FindBy(css = "[type=\"submit\"]")
    private WebElement buttonWelcome;

    public WebElement getButtonWelcome(){
        return buttonWelcome;
    }


    public  void clickCheckbox(){
        checkbox.click();
    }

    @FindBy(css = ".agegate-selector-options")
    private WebElement text;

    public  void selectVisibleText(){
        Select select = new Select(text);
        select.selectByVisibleText("Europe");
    }

    public MainPage clickButtonSubmit(){
        buttonWelcome.click();
        return new MainPage();
    }


}
