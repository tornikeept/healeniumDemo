package ge.tbc.testautomation.tests;

import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.SelfHealingDriver;
import ge.tbc.testautomation.BaseTest;
import ge.tbc.testautomation.steps.Steps1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class Test1  extends BaseTest {
    private Steps1 steps1;

    SelfHealingDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        // Setup WebDriverManager to handle ChromeDriver installation
        WebDriverManager.chromedriver().setup();

        // Setup ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Maximizing the browser window

        // Create the actual WebDriver instance and pass it to SelfHealingDriver
        WebDriver delegate = new ChromeDriver(options);

        // Create SelfHealingDriver and set it as the WebDriver for Selenide
        //driver = SelfHealingDriver.create(delegate);

        // Set the WebDriver using Selenide's way
        WebDriverRunner.setWebDriver(SelfHealingDriver.create(delegate));

        // Initialize your test steps
        steps1 = new Steps1();
    }

    @Test
    public void testClickButton() throws InterruptedException {
        // Open the desired page
        open("https://getbootstrap.com/docs/5.3/examples/buttons/");

        // Perform actions using the Steps1 class
        steps1.clickButton().clickButton();

        // Optional: Add wait if necessary (for debugging purposes)
        Thread.sleep(2000);
    }
}
//public class testTest1 extends BaseTest {
//    Steps1 steps1;
//    static WebDriver driver;
//    @BeforeClass(alwaysRun = true)
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        steps1 = new Steps1();
//        open("https://getbootstrap.com/docs/5.3/examples/buttons/");
//       WebDriver delegate = WebDriverRunner.getWebDriver();
//       driver = SelfHealingDriver.create(delegate);
//    }
//
//
//    @Test
//    public void Test1() throws InterruptedException {
//        open("https://getbootstrap.com/docs/5.3/examples/buttons/");
//        steps1
//                .clickButton()
//                .clickButton();
//    }
//}
