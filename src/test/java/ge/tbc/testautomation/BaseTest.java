package ge.tbc.testautomation;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    //    static WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void setUp() {

        Configuration.timeout = 15000;
        //WebDriverRunner.getWebDriver().manage().window().maximize();

//         WebDriverRunner.setWebDriver(driver);
//         WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {

        WebDriverRunner.driver().close();
    }
}