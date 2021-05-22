import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import utils.Constants;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FirstTest extends JunitRunner {


    //Case 1
    @Test
    public void verifyText() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        Assertions.assertTrue(welcomePage.getWarningText().contains("I am of legal drinking age in"));
        Assertions.assertTrue(welcomePage.getCheckbox().isDisplayed());
        Assertions.assertTrue(welcomePage.getDropdown().isDisplayed());
        Assertions.assertTrue(welcomePage.getButtonWelcome().isDisplayed());
        Assertions.assertFalse(welcomePage.getButtonWelcome().isEnabled());
    }


    //Case 2

    @Test
    public void actionCheckbox() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        /*WebElement timeWait = (new WebDriverWait(driver, Duration.ofSeconds(5)))
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[type=\"submit\"]")));*/
        //Thread.sleep(5000);
        MainPage mainPage = welcomePage.clickButtonSubmit();

        Assertions.assertTrue(mainPage.checkPage().isDisplayed());
    }

    //Case 4
    @Story("Story for Case 4")
    @Epic("First Epic")
    @Link("Link")
    @Issue("Link on Issue")
    @Description("Description")
    @Test
    public void openHeader() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();
        //mainPage.waitForLoadableElement();
        mainPage.waitForTypeOfWine();


        List<WebElement> headerElements = new ArrayList<>();
        headerElements.add(mainPage.hrefWine());
        headerElements.add(mainPage.hrefStore());
        headerElements.add(mainPage.hrefCocktails());
        headerElements.add(mainPage.hrefOurStory());
        headerElements.add(mainPage.hrefFaqs());
        headerElements.add(mainPage.hrefContact());

        for (WebElement item : headerElements) {
            Assertions.assertTrue(item.isDisplayed());
        }

        mainPage.clickButtonYellowTail();
        mainPage.clickButtonMenu();
        Assertions.assertTrue(mainPage.checkPage().isDisplayed());
    }

    //Case 5
    @Story("Story for Case 5")
    @Epic("Second Epic")
    @Link("Link2")
    @Issue("Link2 on Issue")
    @Description("Description2")
    @Test
    public void closeHeader() throws InterruptedException {
        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();
        mainPage.waitForTypeOfWine();
        //mainPage.waitForLoadableElement();
        mainPage.clickButtonYellowTail();

        mainPage.clickButtonMenu();
        Assertions.assertTrue(mainPage.checkPage().isDisplayed());

    }

    //Case 8
    @Test
    public void whereToBuy() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        //Два шага закомментировал чтобы снять скриншот

        //mainPage.clickButtonMenu();
        //mainPage.waitForTypeOfWine();
        //mainPage.waitForLoadableElement();

        WhereToBuyPage whereToBuyPage = mainPage.clickButtonWhere();

        whereToBuyPage.searchElement();

        whereToBuyPage.clickButtonSubmit();
        Assertions.assertTrue(whereToBuyPage.result().isDisplayed());
    }

    //Case 9

    @Test
    public void selectOneGroup() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();
        mainPage.waitForTypeOfWine();
        //mainPage.waitForLoadableElement();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();


        cocktailsPage.openDropdown();

        cocktailsPage.selectRedVine();


        List<WebElement> resultElements = new ArrayList<>();
        resultElements.add(cocktailsPage.mulledWine());
        resultElements.add(cocktailsPage.redWineSpritzer());
        resultElements.add(cocktailsPage.chocolateFondue());
        resultElements.add(cocktailsPage.yellowTailShake());
        resultElements.add(cocktailsPage.redHotChocolate());
        resultElements.add(cocktailsPage.winterRedSpritz());
        resultElements.add(cocktailsPage.veryBerrySlushie());

        int count = 0;
        int expectedCount = 7;
        for (WebElement item : resultElements) {
            Assertions.assertTrue(item.isDisplayed());
            count++;
        }
        Assertions.assertEquals(expectedCount, count);
    }

    //Case 11

    @Test
    public void selectMultipleGroup() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();
        mainPage.clickButtonMenu();
        mainPage.waitForTypeOfWine();
        //mainPage.waitForLoadableElement();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();

        cocktailsPage.openDropdown();
        cocktailsPage.selectRedVine();
        cocktailsPage.selectBublesWine();


        Assertions.assertTrue(cocktailsPage.multiple().isDisplayed());

        List<WebElement> resultElements = new ArrayList<>();

        resultElements.add(cocktailsPage.mulledWine());
        resultElements.add(cocktailsPage.redWineSpritzer());
        resultElements.add(cocktailsPage.chocolateFondue());
        resultElements.add(cocktailsPage.yellowTailShake());
        resultElements.add(cocktailsPage.redHotChocolate());
        resultElements.add(cocktailsPage.winterRedSpritz());
        resultElements.add(cocktailsPage.veryBerrySlushie());

        resultElements.add(cocktailsPage.proseccoPearPunch());
        resultElements.add(cocktailsPage.pinkLemonade());
        resultElements.add(cocktailsPage.sorbetProsecco());
        resultElements.add(cocktailsPage.cranberryChristmasCrush());
        resultElements.add(cocktailsPage.blackberryLavendarBubbles());
        resultElements.add(cocktailsPage.bumbleBeeBevvy());
        resultElements.add(cocktailsPage.greenThumb());
        resultElements.add(cocktailsPage.proseccoPlumCocktail());
        resultElements.add(cocktailsPage.teaTimeSpritzerNew());
        resultElements.add(cocktailsPage.figSprigSpritzNew());
        resultElements.add(cocktailsPage.pinkParadise());

        int count = 0;
        int expectedCount = 18;
        for (WebElement item : resultElements) {
            Assertions.assertTrue(item.isDisplayed());
            count++;
        }

        Assertions.assertEquals(expectedCount, count);

    }

    //Case 3
    @Test
    public void allDispayElements() throws InterruptedException {
        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.checkPage();
        Assertions.assertTrue(mainPage.searchText1().isDisplayed());
        Assertions.assertTrue(mainPage.searchText2().isDisplayed());
        Assertions.assertTrue(mainPage.searchButtonFindWine().isDisplayed());
        Assertions.assertTrue(mainPage.searchFooter().isDisplayed());
    }

    //Case 10
    @Test
    public void scrollRecipePage() throws InterruptedException {

        //WelcomePage welcomePage = new WelcomePage(ProviderForDriver.getDriver());
        WelcomePage welcomePage = new WelcomePage(ProviderForDriver.INSTANCE.getDriver());
        welcomePage.clickCheckbox();
        welcomePage.selectVisibleText();
        MainPage mainPage = welcomePage.clickButtonSubmit();
        mainPage.clickButtonMenu();
        mainPage.waitForTypeOfWine();
        //mainPage.waitForLoadableElement();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();
        Assertions.assertTrue(cocktailsPage.searchRaspberryRose().isDisplayed());
        cocktailsPage.scrollClick();
        Assertions.assertTrue(ProviderForDriver.INSTANCE.getDriver().getPageSource().contains("Ingredients"));
    }


}
