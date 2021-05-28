package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.WebDriverRunner.webdriverContainer;

public class CocktailsPage {

    @FindBy(css = ".dropdown")
    private SelenideElement openDropdown;

    @Step
    public void openDropdown(){
        openDropdown.click();
    }

    @FindBy(css = "[data-value=\"red\"]")
    private SelenideElement selectRedWine;

    @Step
    public void selectRedVine(){
        selectRedWine.click();
    }

    @FindBy(css = "[href='mulled-wine']")
    private SelenideElement mulledWine;

    @Step
    public SelenideElement mulledWine() {
        return mulledWine;
    }

    @FindBy(css = "[href='red-wine-spritzer']")
    private SelenideElement redWineSpritzer;

    @Step
    public SelenideElement redWineSpritzer() {
        return redWineSpritzer;
    }

    @FindBy(css = "[href='chocolate-fondue']")
    private SelenideElement chocolateFondue;

    @Step
    public SelenideElement chocolateFondue() {
        return chocolateFondue;
    }

    @FindBy(css = "[href='yellow-tailshake']")
    private SelenideElement yellowTailShake;

    @Step
    public SelenideElement yellowTailShake() {
        return yellowTailShake;
    }

    @FindBy(css = "[href='red-hot-chocolate']")
    private SelenideElement redHotChocolate;

    @Step
    public SelenideElement redHotChocolate() {
        return redHotChocolate;
    }

    @FindBy(css = "[href='winter-red-spritz']")
    private SelenideElement winterRedSpritz;

    @Step
    public SelenideElement winterRedSpritz() {
        return winterRedSpritz;
    }

    @FindBy(css = "[href='very-berry-slushie']")
    private SelenideElement veryBerrySlushie;

    @Step
    public SelenideElement veryBerrySlushie() {
        return veryBerrySlushie;
    }

    @FindBy(css = "[data-value=\"bubbles\"]")
    private SelenideElement selectBublesWine;

    @Step
    public void selectBublesWine(){
        selectBublesWine.click();
    }

    @FindBy(css = ".selected span")
    private SelenideElement multiple;

    @Step
    public SelenideElement multiple(){
        return multiple;
    }

    @FindBy(css = "[href='prosecco-pear-punch']")
    private SelenideElement proseccoPearPunch;

    @Step
    public SelenideElement proseccoPearPunch() {
        return proseccoPearPunch;
    }

    @FindBy(css = "[href='pink-lemonade']")
    private SelenideElement pinkLemonade;

    @Step
    public SelenideElement pinkLemonade() {
        return pinkLemonade;
    }

    @FindBy(css = "[href='sorbet-prosecco']")
    private SelenideElement sorbetProsecco;

    @Step
    public SelenideElement sorbetProsecco() {
        return sorbetProsecco;
    }

    @FindBy(css = "[href='cranberry-christmas-crush']")
    private SelenideElement cranberryChristmasCrush;

    @Step
    public SelenideElement cranberryChristmasCrush() {
        return cranberryChristmasCrush;
    }

    @FindBy(css = "[href='blackberry-lavendar-bubbles']")
    private SelenideElement blackberryLavendarBubbles;

    @Step
    public SelenideElement blackberryLavendarBubbles() {
        return blackberryLavendarBubbles;
    }

    @FindBy(css = "[href='bumble-bee-bevvy']")
    private SelenideElement bumbleBeeBevvy;

    @Step
    public SelenideElement bumbleBeeBevvy() {
        return bumbleBeeBevvy;
    }

    @FindBy(css = "[href='green-thumb']")
    private SelenideElement greenThumb;

    @Step
    public SelenideElement greenThumb() {
        return greenThumb;
    }

    @FindBy(css = "[href='prosecco-plum-cocktail']")
    private SelenideElement proseccoPlumCocktail;

    @Step
    public SelenideElement proseccoPlumCocktail() {
        return proseccoPlumCocktail;
    }

    @FindBy(css = "[href='tea-time-spritzer-new']")
    private SelenideElement teaTimeSpritzerNew;

    @Step
    public SelenideElement teaTimeSpritzerNew() {
        return teaTimeSpritzerNew;
    }

    @FindBy(css = "[href='fig-sprig-spritz-new']")
    private SelenideElement figSprigSpritzNew;

    @Step
    public SelenideElement figSprigSpritzNew() {
        return figSprigSpritzNew;
    }

    @FindBy(css = "[href='pink-paradise']")
    private SelenideElement pinkParadise;

    @Step
    public SelenideElement pinkParadise() {
        return pinkParadise;
    }

    @FindBy(css = "[href='raspberry-rose']")
    private SelenideElement searchRaspberryRose;

    @Step
    public SelenideElement searchRaspberryRose() {
        return searchRaspberryRose;
    }

    @Step
    public void scrollClick(){
        actions().moveToElement(searchRaspberryRose).build().perform();
        searchRaspberryRose().click();
    }

    @FindBy(css =".row .ingredients")
    private SelenideElement ingredients;

    @Step
    public SelenideElement ingredientsIsDisplay(){
        return ingredientsIsDisplay();
    }

}
