package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    Actions actions;
    JavascriptExecutor executor;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.executor = (JavascriptExecutor)driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        PageFactory.initElements(driver, this);

    }
}
