package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefaultPage extends BasePage {

//    By loginButton = By.id("nav-link-login");

    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-link-login")
    WebElement loginButton;

    public void clickLoginButton() {
 //       driver.findElement(loginButton).click();
        loginButton.click();

    }

    public boolean isLoginButtonDisplayed(){
        return loginButton.isDisplayed();
    }
}
