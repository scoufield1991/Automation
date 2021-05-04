import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FirstTest {

    //Case 1
    @Test
    public void verifyText() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement text = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        Assertions.assertTrue(text.getText().contains("I am of legal drinking age in"));
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void verifyCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        Assertions.assertTrue(checkbox.isDisplayed());
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void verifyDropdown() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement dropdown = driver.findElement(By.cssSelector(".agegate-selector-options"));
        Assertions.assertTrue(dropdown.isDisplayed());
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void verifyButtonWelcome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        Assertions.assertTrue(button.isDisplayed());
        Assertions.assertFalse(button.isEnabled());
        Thread.sleep(5000);
        driver.quit();
    }

    //Case 2

    @Test
    public void actionCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(5000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(5000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(5000);
        driver.quit();
    }

    //Case 4
    @Test
    public void openHeader() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(5000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(5000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(5000);

        WebElement buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        buttonMenu.click();
        Thread.sleep(5000);
        List<WebElement> headerElements = new ArrayList<>();
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/wines/']")));
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/stores/']")));
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/cocktails/']")));
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/our-story/']")));
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/faqs/']")));
        headerElements.add(driver.findElement(By.cssSelector(".main-nav [href$='/contact/']")));

        for (WebElement item : headerElements) {
            Assertions.assertTrue(item.isDisplayed());
        }
        Thread.sleep(5000);
        WebElement buttonYellowTail = driver.findElement(By.cssSelector(".top-nav [href$='.com']"));
        buttonYellowTail.click();
        Thread.sleep(5000);

        buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        Assertions.assertTrue(buttonMenu.isDisplayed());

        driver.quit();
    }

    //Case 5

    @Test
    public void closeHeader() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(5000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(5000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(5000);

        WebElement buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        buttonMenu.click();

        Thread.sleep(5000);

        WebElement buttonYellowTail = driver.findElement(By.cssSelector(".top-nav [href$='.com']"));
        buttonYellowTail.click();
        Thread.sleep(5000);

        buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        Assertions.assertTrue(buttonMenu.isDisplayed());

        driver.quit();
    }

    //Case 8
    @Test
    public void whereToBuy() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(1000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(1000);

        WebElement buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        buttonMenu.click();

        Thread.sleep(5000);

        WebElement buttonWhere = driver.findElement(By.cssSelector(".main-nav [href$='/stores/']"));
        buttonWhere.click();
        Thread.sleep(1000);

        WebElement searchElement = driver.findElement(By.cssSelector(".stores [name=\"locationName\"]"));
        searchElement.click();
        searchElement.sendKeys("Eg. Sydney, NSW 2000");

        Thread.sleep(1000);

        WebElement buttonSubmit = driver.findElement(By.cssSelector(".stores [class=\"search-submit\"]"));
        buttonSubmit.click();
        Thread.sleep(5000);

        WebElement result = driver.findElement(By.cssSelector(".results"));
        Assertions.assertTrue(result.isDisplayed());
        driver.quit();
    }

    //Case 9

    @Test
    public void selectOneGroup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(1000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(1000);

        WebElement buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        buttonMenu.click();

        Thread.sleep(5000);

        WebElement buttonWhere = driver.findElement(By.cssSelector(".main-nav [href$='/cocktails/']"));
        buttonWhere.click();
        Thread.sleep(1000);

        WebElement selectWine = driver.findElement(By.cssSelector(".dropdown"));
        selectWine.click();

        Thread.sleep(1000);

        WebElement selectRedWine = driver.findElement(By.cssSelector("[data-value=\"red\"]"));
        selectRedWine.click();

        Thread.sleep(5000);

        List<WebElement> resultElements = new ArrayList<>();
        resultElements.add(driver.findElement(By.cssSelector("[href='mulled-wine']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='red-wine-spritzer']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='chocolate-fondue']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='yellow-tailshake']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='red-hot-chocolate']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='winter-red-spritz']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='very-berry-slushie']")));

        int count =0;
        for (WebElement item : resultElements) {
            Assertions.assertTrue(item.isDisplayed());
            count++;
        }

        System.out.println("recipes of red: " + count);
        driver.quit();
    }

    //Case 11

    @Test
    public void selectMultipleGroup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        WebElement checkbox = driver.findElement(By.cssSelector("[for=\"confirm\"]"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        checkbox.click();
        Thread.sleep(1000);
        Select select = new Select(driver.findElement(By.cssSelector(".agegate-selector-options")));
        select.selectByVisibleText("Europe");
        Thread.sleep(1000);
        WebElement button = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        button.click();
        Thread.sleep(1000);

        WebElement buttonMenu = driver.findElement(By.cssSelector(".fa.fa-bars span"));
        //Assertions.assertTrue(checkbox.isDisplayed());
        buttonMenu.click();

        Thread.sleep(5000);

        WebElement buttonWhere = driver.findElement(By.cssSelector(".main-nav [href$='/cocktails/']"));
        buttonWhere.click();
        Thread.sleep(1000);

        WebElement selectWine = driver.findElement(By.cssSelector(".dropdown"));
        selectWine.click();

        Thread.sleep(1000);

        WebElement selectRedWine = driver.findElement(By.cssSelector("[data-value=\"red\"]"));
        selectRedWine.click();

        Thread.sleep(1000);

        WebElement selectBublesWine = driver.findElement(By.cssSelector("[data-value=\"bubbles\"]"));
        selectBublesWine.click();

        Thread.sleep(1000);

        WebElement multiple = driver.findElement(By.cssSelector(".selected span"));
        Assertions.assertTrue(multiple.isDisplayed());

        Thread.sleep(5000);

        List<WebElement> resultElements = new ArrayList<>();
        resultElements.add(driver.findElement(By.cssSelector("[href='mulled-wine']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='red-wine-spritzer']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='chocolate-fondue']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='yellow-tailshake']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='red-hot-chocolate']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='winter-red-spritz']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='very-berry-slushie']")));

        resultElements.add(driver.findElement(By.cssSelector("[href='prosecco-pear-punch']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='pink-lemonade']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='sorbet-prosecco']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='cranberry-christmas-crush']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='blackberry-lavendar-bubbles']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='bumble-bee-bevvy']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='green-thumb']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='prosecco-plum-cocktail']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='tea-time-spritzer-new']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='fig-sprig-spritz-new']")));
        resultElements.add(driver.findElement(By.cssSelector("[href='pink-paradise']")));

        int count =0;

        for (WebElement item : resultElements) {
            Assertions.assertTrue(item.isDisplayed());
            count++;
        }
        System.out.println("multiple recipes: " + count);

        driver.quit();
    }
}
