import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.driver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static java.lang.System.setProperty;

public abstract class SelenideBase {

    @Before
    public void beforeSuite() {
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 300;
    }

    @After
    public void After(){
        driver().close();
    }
}