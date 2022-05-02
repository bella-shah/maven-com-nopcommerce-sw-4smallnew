package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homepage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getRegisterMessage();
        Assert.assertEquals("Register Not Displayed", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnGenderRadio();
        registerPage.enterFirstName("Bella");
        registerPage.enterLastName("Shah");
        registerPage.selectByValueFromDropDown(By.name("DateOfBirthDay"), "5");
        clickOnElement(By.name("MonthOfBirthDay"));
        registerPage.selectByValueFromDropDown(By.name("MonthOfBirthDay"), "9");
        clickOnElement(By.name("YearOfBirthDay"));
        registerPage.selectByValueFromDropDown(By.name("YearOfBirthDay"), "1982");
        registerPage.enterEmailAddress("abc@gmail.com");
        registerPage.enterPassword("Bella123");
        registerPage.enterConfirmPassword("Bella123");
        registerPage.clickOnRegisterBtn();
        String expectedMessage = "Your registration completed";
        String actualMessage = registerPage.getRegisterMessage();
        Assert.assertEquals("Unable To Register", expectedMessage, actualMessage);

    }
}

