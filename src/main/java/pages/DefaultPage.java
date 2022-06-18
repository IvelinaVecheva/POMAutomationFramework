package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage {
    WebDriver driver;

//    By loginButton = By.id("nav-link-login");

    public DefaultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    public void clickLoginButton() {
 //       driver.findElement(loginButton).click();
        loginButton.click();

    }
}
