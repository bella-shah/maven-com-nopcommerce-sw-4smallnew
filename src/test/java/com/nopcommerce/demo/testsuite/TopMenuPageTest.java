package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    HomePage homepage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();
    @Test
    public void userShouldNavigateToComputersPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Computers"));
        String expectedMessage = "Computers";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Electronics"));
        String expectedMessage = "Electronics";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Apparel"));
        String expectedMessage = "Apparel";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Digital downloads"));
        String expectedMessage = "Digital downloads";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Books"));
        String expectedMessage = "Books";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Jewelry"));
        String expectedMessage = "Jewelry";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homepage.clickOnRegisterLink();
        clickOnElement(By.partialLinkText("Gift Cards"));
        String expectedMessage = "Gift Cards";
        String actualMessage = topMenuPage.verifyComputersMessage();
        Assert.assertEquals("Title not displayed properly", expectedMessage, actualMessage);
    }
}

