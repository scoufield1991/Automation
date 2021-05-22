package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CocktailsPage;
import utils.Waiters;

import java.time.Duration;

public class MainPage extends AbstractPage {

    public MainPage() {
        super();
        //waitForLoadableElement();
    }



    @FindBy(css = ".fa.fa-bars span")
    private WebElement buttonMenu;

    public WebElement checkPage() {
        return buttonMenu;
    }

    @Step
    public void clickButtonMenu() {
        buttonMenu.click();
    }

    @FindBy(css = ".main-nav [href$='/wines/']")
    private WebElement hrefWine;

    public WebElement hrefWine() {
        return hrefWine;
    }

    @FindBy(css = ".main-nav [href$='/stores/']")
    private WebElement hrefStore;

    public WebElement hrefStore() {
        return hrefStore;
    }

    @FindBy(css = ".main-nav [href$='/cocktails/']")
    private WebElement hrefCocktails;

    public WebElement hrefCocktails() {
        return hrefCocktails;
    }

    @FindBy(css = ".main-nav [href$='/our-story/']")
    private WebElement hrefOurStory;

    public WebElement hrefOurStory() {
        return hrefOurStory;
    }

    @FindBy(css = ".main-nav [href$='/faqs/']")
    private WebElement hrefFaqs;

    public WebElement hrefFaqs() {
        return hrefFaqs;
    }

    @FindBy(css = ".main-nav [href$='/contact/']")
    private WebElement hrefContact;

    public WebElement hrefContact() {
        return hrefContact;
    }

    @FindBy(css = ".top-nav [href$='.com']")
    private WebElement buttonYellowTail;

    @Step
    public void clickButtonYellowTail() {
        buttonYellowTail.click();
    }

    public WhereToBuyPage clickButtonWhere() {
        hrefStore.click();
        return new WhereToBuyPage();
    }

    public CocktailsPage clickButtonCocktails(){
        hrefCocktails.click();
        return new CocktailsPage();
    }

    @FindBy(css = ".content.animation-screen.-one>h2")
    private WebElement searchText1;

    public WebElement searchText1() {
        return searchText1;
    }

    @FindBy(css = ".content.animation-screen.-one>h2")
    private WebElement searchText2;

    public WebElement searchText2() {
        return searchText2;
    }

    @FindBy(css = ".content.animation-screen.-one [class='button home-button']")
    private WebElement searchButtonFindWine;

    public WebElement searchButtonFindWine() {
        return searchButtonFindWine;
    }

    @FindBy(css = ".primary-footer")
    private WebElement searchFooter;

    public WebElement searchFooter() {
        return searchFooter;
    }

    @Step
    public void waitForTypeOfWine() {
        (new WebDriverWait(ProviderForDriver.INSTANCE.getDriver(), Duration.ofSeconds(1)))
                .until(ExpectedConditions.visibilityOf(hrefWine()));
    }

    @Override
    public void waitForLoadableElement() {
        Waiters.waitForElementToBeVisible(buttonMenu);
        //buttonMenu.click();
        //waitForElementToBeVisible(hrefWine,5);
        /*(new WebDriverWait(driver, Duration.ofSeconds(7)))
                .until(ExpectedConditions.visibilityOf(hrefWine()));*/
    }

}
