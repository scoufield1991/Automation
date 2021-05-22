package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CocktailsPage extends AbstractPage {

    public CocktailsPage() {
        super();
        waitForLoadableElement();
    }

    @Override
    public void waitForLoadableElement() {

    }

    @FindBy(css = ".dropdown")
    private WebElement openDropdown;

    public void openDropdown(){
        openDropdown.click();
    }

    @FindBy(css = "[data-value=\"red\"]")
    private WebElement selectRedWine;

    public void selectRedVine(){
        selectRedWine.click();
    }

    @FindBy(css = "[href='mulled-wine']")
    private WebElement mulledWine;

    public WebElement mulledWine() {
        return mulledWine;
    }

    @FindBy(css = "[href='red-wine-spritzer']")
    private WebElement redWineSpritzer;

    public WebElement redWineSpritzer() {
        return redWineSpritzer;
    }

    @FindBy(css = "[href='chocolate-fondue']")
    private WebElement chocolateFondue;

    public WebElement chocolateFondue() {
        return chocolateFondue;
    }

    @FindBy(css = "[href='yellow-tailshake']")
    private WebElement yellowTailShake;

    public WebElement yellowTailShake() {
        return yellowTailShake;
    }

    @FindBy(css = "[href='red-hot-chocolate']")
    private WebElement redHotChocolate;

    public WebElement redHotChocolate() {
        return redHotChocolate;
    }

    @FindBy(css = "[href='winter-red-spritz']")
    private WebElement winterRedSpritz;

    public WebElement winterRedSpritz() {
        return winterRedSpritz;
    }

    @FindBy(css = "[href='very-berry-slushie']")
    private WebElement veryBerrySlushie;

    public WebElement veryBerrySlushie() {
        return veryBerrySlushie;
    }

    @FindBy(css = "[data-value=\"bubbles\"]")
    private WebElement selectBublesWine;

    public void selectBublesWine(){
        selectBublesWine.click();
    }

    @FindBy(css = ".selected span")
    private WebElement multiple;

    public WebElement multiple(){
        return multiple;
    }

    @FindBy(css = "[href='prosecco-pear-punch']")
    private WebElement proseccoPearPunch;

    public WebElement proseccoPearPunch() {
        return proseccoPearPunch;
    }

    @FindBy(css = "[href='pink-lemonade']")
    private WebElement pinkLemonade;

    public WebElement pinkLemonade() {
        return pinkLemonade;
    }

    @FindBy(css = "[href='sorbet-prosecco']")
    private WebElement sorbetProsecco;

    public WebElement sorbetProsecco() {
        return sorbetProsecco;
    }

    @FindBy(css = "[href='cranberry-christmas-crush']")
    private WebElement cranberryChristmasCrush;

    public WebElement cranberryChristmasCrush() {
        return cranberryChristmasCrush;
    }

    @FindBy(css = "[href='blackberry-lavendar-bubbles']")
    private WebElement blackberryLavendarBubbles;

    public WebElement blackberryLavendarBubbles() {
        return blackberryLavendarBubbles;
    }

    @FindBy(css = "[href='bumble-bee-bevvy']")
    private WebElement bumbleBeeBevvy;

    public WebElement bumbleBeeBevvy() {
        return bumbleBeeBevvy;
    }

    @FindBy(css = "[href='green-thumb']")
    private WebElement greenThumb;

    public WebElement greenThumb() {
        return greenThumb;
    }

    @FindBy(css = "[href='prosecco-plum-cocktail']")
    private WebElement proseccoPlumCocktail;

    public WebElement proseccoPlumCocktail() {
        return proseccoPlumCocktail;
    }

    @FindBy(css = "[href='tea-time-spritzer-new']")
    private WebElement teaTimeSpritzerNew;

    public WebElement teaTimeSpritzerNew() {
        return teaTimeSpritzerNew;
    }

    @FindBy(css = "[href='fig-sprig-spritz-new']")
    private WebElement figSprigSpritzNew;

    public WebElement figSprigSpritzNew() {
        return figSprigSpritzNew;
    }

    @FindBy(css = "[href='pink-paradise']")
    private WebElement pinkParadise;

    public WebElement pinkParadise() {
        return pinkParadise;
    }

    @FindBy(css = "[href='raspberry-rose']")
    private WebElement searchRaspberryRose;

    public WebElement searchRaspberryRose() {
        return searchRaspberryRose;
    }

    public void scrollClick(){
        Actions builder = new Actions(ProviderForDriver.INSTANCE.getDriver());
        builder.moveToElement(searchRaspberryRose()).build().perform();
        searchRaspberryRose().click();
    }

}
