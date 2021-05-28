package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.page;

public class WelcomePage {

    @FindBy(css = "[for=\"confirm\"]")
    private SelenideElement confirm;

    @Step
    public SelenideElement  getText(){
        return confirm;
    }

    @FindBy(css = "[for=\"confirm\"]")
    private SelenideElement  checkbox;

    @Step
    public SelenideElement  getCheckbox(){
        return checkbox;
    }

    @FindBy(css = ".agegate-selector-options")
    private SelenideElement  dropdown;

    @Step
    public SelenideElement  getDropdown(){
        return dropdown;
    }

    @FindBy(css = "[type=\"submit\"]")
    private SelenideElement  buttonWelcome;

    @Step
    public SelenideElement  getButtonWelcome(){
        return buttonWelcome;
    }

    @Step
    public  void clickCheckbox(){
        checkbox.click();
    }

    @FindBy(css = ".agegate-selector-options")
    private SelenideElement  text;

    @Step
    public  void selectOption(){
        text.selectOption("Europe");
    }


    public MainPage clickButtonSubmit(){
        buttonWelcome.click();
        return page(MainPage.class);
    }


}
