import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProviderForDriver;
import utils.Constants;

import java.time.Duration;

public class JunitRunner {

    @BeforeEach
    public void before() {

        ProviderForDriver.getDriver().get(Constants.BASIC_URL);
        ProviderForDriver.getDriver().manage().window().maximize();
        ProviderForDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void after() {
        ProviderForDriver.getDriver().quit();
    }
}
