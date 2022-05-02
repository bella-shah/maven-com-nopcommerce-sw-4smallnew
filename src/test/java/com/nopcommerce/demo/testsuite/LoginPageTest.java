package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginpage = new LoginPage();


    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginpage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login Page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginpage.enterEmailId("prime123@gmail.com");
        loginpage.enterPassword("prime123");
        loginpage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginpage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }
}



