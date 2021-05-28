package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhereToBuyPage  {

    @FindBy(css = ".stores [name=\"locationName\"]")
    private SelenideElement searchElement;

    @Step
    public void searchElement(){
        searchElement.click();
        searchElement.setValue("Eg. Sydney, NSW 2000");
    }

    @FindBy(css = ".stores [class=\"search-submit\"]")
    private SelenideElement buttonSubmit;

    @Step
    public void clickButtonSubmit(){
        buttonSubmit.click();
    }

    @FindBy(css = ".results")
    private SelenideElement result;

    @Step
    public SelenideElement result(){
        return result;
    }
}
