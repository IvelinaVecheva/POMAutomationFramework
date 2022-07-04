package pomtests;

import org.testng.Assert;
import org.testng.annotations.*;

public class SmokeTests extends BaseTests{

//    @Test
//    public void createAccount() throws InterruptedException {
//        driver.get("http://training.skillo-bg.com/");
//        defaultPage.clickLoginButton();
//        loginModal.clickRegisterButton();
//        signUpModal.registerUser("test62", "test62@test.com", "test62");
//        Thread.sleep(1500);
//        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
//    }

    @Test  (retryAnalyzer = utils.Retry.class)
    public void loginTest(){
        driver.get("http://training.skillo-bg.com/posts/all");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test61");
        loginModal.enterPassword("test61");
        loginModal.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
        Assert.assertTrue(homePage.isLogoutButtonDisplayed());
    }


    @Test(priority = 2)
    public void commentPost() // throws InterruptedException
    {
        loginTest();
        homePage.openFirstPost();
        postModal.enterComment("My very first new comment.");
//        Thread.sleep(1500);

    }

    @Test(priority = 3)
    public void likePost(){

        //TODO like post test
    }

    @Test(priority = 4)
    public void logoutTest(){
        loginTest();
        homePage.logoutUser();
        Assert.assertTrue(defaultPage.isLoginButtonDisplayed());
    }


}
