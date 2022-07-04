package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpModal extends BasePage {

    //Locators
    @FindBy(xpath = "//input[@formcontrolname='username']")
    WebElement usernameField;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@formcontrolname='password']")
    WebElement passwordField;
    @FindBy(xpath = "//input[@formcontrolname='confirmPassword']")
    WebElement confirmPasswordField;
    @FindBy(id = "sign-in-button")
    WebElement signUpButton;

    public SignUpModal(WebDriver driver) {
        super(driver);
    }

    //Methods
    public void inputUsername(String username) {      usernameField.sendKeys(username);    }

    public void inputEmail(String email) {        emailField.sendKeys(email);    }

    public void inputPassword(String password) {        passwordField.sendKeys(password);    }

    public void inputConfirmPassword(String confirmPassword) {       confirmPasswordField.sendKeys(confirmPassword);    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void registerUser(String username, String email, String password) throws InterruptedException {
        //       driver.navigate().refresh();
        inputUsername(username);
        inputEmail(email);
        inputPassword(password);
        inputConfirmPassword(password);
        Thread.sleep(1500);
        clickSignUpButton();
    }

}
