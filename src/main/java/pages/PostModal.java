package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostModal extends BasePage{
    WebDriver driver;

    public PostModal(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(xpath = "//input[@placeholder='Comment here']")
    WebElement commentField;

    public void enterComment(String comment){
        commentField.clear();
        commentField.sendKeys(comment);
        commentField.sendKeys(Keys.ENTER);

    }


}
