package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {


    @FindBy(css = ".fa.fa-bars span")
    private SelenideElement buttonMenu;

    @Step
    public SelenideElement checkPage() {
        return buttonMenu;
    }

    @Step
    public void clickButtonMenu() {
        buttonMenu.click();
    }

    @FindBy(css = ".main-nav [href$='/wines/']")
    private SelenideElement hrefWine;

    @Step
    public SelenideElement hrefWine() {
        return hrefWine;
    }

    @FindBy(css = ".main-nav [href$='/stores/']")
    private SelenideElement hrefStore;

    @Step
    public SelenideElement hrefStore() {
        return hrefStore;
    }

    @FindBy(css = ".main-nav [href$='/cocktails/']")
    private SelenideElement hrefCocktails;

    @Step
    public SelenideElement hrefCocktails() {
        return hrefCocktails;
    }

    @FindBy(css = ".main-nav [href$='/our-story/']")
    private SelenideElement hrefOurStory;

    @Step
    public SelenideElement hrefOurStory() {
        return hrefOurStory;
    }

    @FindBy(css = ".main-nav [href$='/faqs/']")
    private SelenideElement hrefFaqs;

    @Step
    public SelenideElement hrefFaqs() {
        return hrefFaqs;
    }

    @FindBy(css = ".main-nav [href$='/contact/']")
    private SelenideElement hrefContact;

    @Step
    public SelenideElement hrefContact() {
        return hrefContact;
    }

    @FindBy(css = ".top-nav [href$='.com']")
    private SelenideElement buttonYellowTail;

    @Step
    public void clickButtonYellowTail() {
        buttonYellowTail.click();
    }

    @Step
    public WhereToBuyPage clickButtonWhere() {
        hrefStore.click();
        return page(WhereToBuyPage.class);
    }

    @Step
    public CocktailsPage clickButtonCocktails(){
        hrefCocktails.click();
        return page(CocktailsPage.class);
    }

    @FindBy(css = ".content.animation-screen.-one>h2")
    private SelenideElement searchText1;

    @Step
    public SelenideElement searchText1() {
        return searchText1;
    }

    @FindBy(css = ".content.animation-screen.-one>h2")
    private SelenideElement searchText2;

    @Step
    public SelenideElement searchText2() {
        return searchText2;
    }

    @FindBy(css = ".content.animation-screen.-one [class='button home-button']")
    private SelenideElement searchButtonFindWine;

    @Step
    public SelenideElement searchButtonFindWine() {
        return searchButtonFindWine;
    }

    @FindBy(css = ".primary-footer")
    private SelenideElement searchFooter;

    @Step
    public SelenideElement searchFooter() {
        return searchFooter;
    }


}
