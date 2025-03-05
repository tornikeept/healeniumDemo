package ge.tbc.testautomation.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.epam.healenium.SelfHealingDriver;
import ge.tbc.testautomation.pages.Page1;
import org.openqa.selenium.WebDriver;

public class Steps1 {
    Page1 pag1 = new Page1();

    public Steps1 clickButton() throws InterruptedException {
//
        Selenide.Wait().until(driver ->pag1.button.isDisplayed());
        pag1.button.click();
        Thread.sleep(3000);
        pag1.button.click();
        Thread.sleep(3000);

        return this;
    }
}
