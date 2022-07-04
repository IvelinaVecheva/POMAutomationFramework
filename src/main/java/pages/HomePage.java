package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page that the user is after he has been logged in.
 */
public class HomePage extends BasePage {

    // Locators using PageFactory
    @FindBy(id = "nav-link-new-post")
    WebElement newPostButton;
    @FindBy(xpath = "//*[contains(@class,'sign-out')]")
    WebElement logoutButton;
    @FindBy(xpath = "(//div[@class='post-feed-img'])[1]/img")
    WebElement firstPost;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isNewPostButtonDisplayed() {
        return newPostButton.isDisplayed();
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }

    public void openFirstPost() {
        firstPost.click();
    }

    public boolean isUserLogged() {
        return logoutButton.isDisplayed();
    }
    public void logoutUser(){
        logoutButton.click();
    }

}

