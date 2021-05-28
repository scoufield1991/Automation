import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.impl.Html;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.ArrayList;
import java.util.List;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import utils.Constants;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class FirstTest extends SelenideRunner {


    //Case 1
    @Test
    public void verifyText()  {
        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.getText().shouldHave(text("I am of legal drinking age in"));
        welcomePage.getCheckbox().shouldBe(visible);
        welcomePage.getDropdown().shouldBe(visible);
        welcomePage.getButtonWelcome().shouldBe(visible);
        welcomePage.getButtonWelcome().shouldBe(disabled);
    }


    //Case 2

    @Test
    public void actionCheckbox() {
        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();
        mainPage.checkPage().shouldBe(visible);
    }

    //Case 4
    @Story("Story for Case 4")
    @Epic("First Epic")
    @Link("Link")
    @Issue("Link on Issue")
    @Description("Description")
    @Test
    public void openHeader()  {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();

        List<SelenideElement> headerElements = new ArrayList<>();
        headerElements.add(mainPage.hrefWine());
        headerElements.add(mainPage.hrefStore());
        headerElements.add(mainPage.hrefCocktails());
        headerElements.add(mainPage.hrefOurStory());
        headerElements.add(mainPage.hrefFaqs());
        headerElements.add(mainPage.hrefContact());

        for (SelenideElement item : headerElements) {
            item.shouldBe(visible);
        }

        mainPage.clickButtonYellowTail();
        mainPage.clickButtonMenu();
        mainPage.checkPage().shouldBe(visible);
    }

    //Case 5
    @Story("Story for Case 5")
    @Epic("Second Epic")
    @Link("Link2")
    @Issue("Link2 on Issue")
    @Description("Description2")
    @Test
    public void closeHeader()  {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();
        mainPage.clickButtonYellowTail();
        mainPage.clickButtonMenu();

        mainPage.checkPage().shouldBe(visible);

    }

    //Case 8
    @Test
    public void whereToBuy()  {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        //Специальная ошибка для скриншота
        //mainPage.clickButtonMenu();

        WhereToBuyPage whereToBuyPage = mainPage.clickButtonWhere();
        whereToBuyPage.searchElement();
        whereToBuyPage.clickButtonSubmit();
        whereToBuyPage.result().shouldBe(visible);
    }

    //Case 9

    @Test
    public void selectOneGroup() {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();

        cocktailsPage.openDropdown();

        cocktailsPage.selectRedVine();


        List<SelenideElement> resultElements = new ArrayList<>();
        resultElements.add(cocktailsPage.mulledWine());
        resultElements.add(cocktailsPage.redWineSpritzer());
        resultElements.add(cocktailsPage.chocolateFondue());
        resultElements.add(cocktailsPage.yellowTailShake());
        resultElements.add(cocktailsPage.redHotChocolate());
        resultElements.add(cocktailsPage.winterRedSpritz());
        resultElements.add(cocktailsPage.veryBerrySlushie());

        int count = 0;
        int expectedCount = 7;
        for (SelenideElement item : resultElements) {
            item.shouldBe(visible);
            count++;
        }
        Assertions.assertEquals(expectedCount, count);
    }

    //Case 11

    @Test
    public void selectMultipleGroup(){

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();

        cocktailsPage.openDropdown();
        cocktailsPage.selectRedVine();
        cocktailsPage.selectBublesWine();
        cocktailsPage.multiple().shouldBe(visible);

        List<SelenideElement> resultElements = new ArrayList<>();

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
        for (SelenideElement item : resultElements) {
            item.shouldBe(visible);
            count++;
        }

        Assertions.assertEquals(expectedCount, count);

    }

    //Case 3
    @Test
    public void allDisplayElements() {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.checkPage().shouldBe(visible);
        mainPage.searchText1().shouldBe(visible);
        mainPage.searchText2().shouldBe(visible);
        mainPage.searchButtonFindWine().shouldBe(visible);
        mainPage.searchFooter().shouldBe(visible);

    }

    //Case 10

    @Test
    public void scrollRecipePage()  {

        WelcomePage welcomePage = open(Constants.BASIC_URL,WelcomePage.class);
        welcomePage.clickCheckbox();
        welcomePage.selectOption();
        MainPage mainPage = welcomePage.clickButtonSubmit();

        mainPage.clickButtonMenu();

        CocktailsPage cocktailsPage = mainPage.clickButtonCocktails();
        cocktailsPage.searchRaspberryRose().shouldBe(visible);
        cocktailsPage.scrollClick();

        boolean actual =  webdriverContainer.getPageSource().contains("Ingredients");
        Assertions.assertTrue(actual);

    }


}
