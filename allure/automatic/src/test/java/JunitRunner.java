import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProviderForDriver;
import utils.Constants;

import java.time.Duration;

@ExtendWith(TestResultLoggerExtension.class)
public class JunitRunner {

    @BeforeEach
    public void before() {

        ProviderForDriver.INSTANCE.getDriver().get(Constants.BASIC_URL);
        ProviderForDriver.INSTANCE.getDriver().manage().window().maximize();
        ProviderForDriver.INSTANCE.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    /*@AfterEach
    public void after() {
        ProviderForDriver.INSTANCE.getDriver().quit();
    }*/
}
