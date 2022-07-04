package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginModal extends BasePage{
    WebDriver driver;

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(id = "defaultLoginFormUsername")
    WebElement userNameField;

    @FindBy(id="defaultLoginFormPassword")
    WebElement passwordField;

    @FindBy(id="sign-in-button")
    WebElement signInButton;

    @FindBy(xpath="//a[text()='Register']")
    WebElement registerButton;

    public void enterUsername(String username){
        userNameField.clear();
        userNameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
