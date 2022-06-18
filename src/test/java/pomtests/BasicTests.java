package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginModal;

import java.time.Duration;

public class BasicTests {

    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        loginModal = new LoginModal(driver);
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }

    @Test
    public void loginTest(){
        driver.get("http://training.skillo-bg.com/posts/all");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test51");
        loginModal.enterPassword("test51");
        loginModal.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
        Assert.assertTrue(homePage.isLogoutButtonDisplayed());
    }


}
