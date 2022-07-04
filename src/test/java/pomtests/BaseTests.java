package pomtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import utils.Screenshot;

import java.time.Duration;

public class BaseTests {
    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;
    SignUpModal signUpModal;
    PostModal postModal;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        loginModal = new LoginModal(driver);
        homePage = new HomePage(driver);
        signUpModal = new SignUpModal(driver);
        postModal = new PostModal(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result){

        if (!result.isSuccess()) {
            Screenshot.capture(driver, "screenshots", result.getName());
        }
        driver.quit();
    }
}
