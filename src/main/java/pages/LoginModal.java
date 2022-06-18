package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginModal {
    WebDriver driver;

    public LoginModal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "defaultLoginFormUsername")
    WebElement userNameField;

    @FindBy(id="defaultLoginFormPassword")
    WebElement passwordField;

    @FindBy(id="sign-in-button")
    WebElement signInButton;


    // Methods
    public void enterUsername(String username){
//        driver.findElement(userNameField).clear();
//        driver.findElement(userNameField).sendKeys(username);

        userNameField.clear();
        userNameField.sendKeys(username);

    }

    public void enterPassword(String password){
//        driver.findElement(passwordField).clear();
//        driver.findElement(passwordField).sendKeys(password);

        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignIn(){
//        driver.findElement(signInButton).click();
        signInButton.click();

    }

}
