package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProviderForDriver;

import java.time.Duration;

public class Waiters {

    public static WebElement waitForElementToBeVisible(WebElement element){
        return new WebDriverWait(ProviderForDriver.INSTANCE.getDriver(), Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOf(element));
    }

}
