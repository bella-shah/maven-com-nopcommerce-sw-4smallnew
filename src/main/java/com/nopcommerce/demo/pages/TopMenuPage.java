package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By computerTab = By.partialLinkText("Computers");
    By computersMessage = By.xpath("//div[@class='page-title']");
    By electronicsTab = By.partialLinkText("Electronics");
    By electronicsMessage = By.xpath("//div[@class='page-title']");
    By apparelTab = By.partialLinkText("Apparel");
    By apparelMessage = By.xpath("//div[@class='page-title']");
    By digitalDownloadsTab = By.partialLinkText("Digital downloads");
    By digitalDownloadsMessage = By.xpath("//div[@class='page-title']");
    By booksTab = By.partialLinkText("Books");
    By booksMessage = By.xpath("//div[@class='page-title']");
    By jewelryTab = By.partialLinkText("Jewelry");
    By jewelryMessage = By.xpath("//div[@class='page-title']");
    By giftCardTab = By.partialLinkText("Gift Cards");
    By giftCardMessage = By.xpath("//div[@class='page-title']");
    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }
    public String verifyComputersMessage() {
        return getTextFromElement(computersMessage);
    }
    public void clickOnElectronicsTab(){
        clickOnElement(electronicsTab);
    }
    public String verifyElectronicsMessage() {
        return getTextFromElement(electronicsMessage);
    }
    public void clickOnApparelTab(){
        clickOnElement(apparelTab);
    }
    public String verifyApparelMessage() {
        return getTextFromElement(apparelMessage);
    }
    public void clickOnDigitalDownloadsTab(){
        clickOnElement(digitalDownloadsTab);
    }
    public String verifyDigitalDownloadsMessage() {
        return getTextFromElement(digitalDownloadsMessage);
    }
    public void clickOnBooksTab(){
        clickOnElement(booksTab);
    }
    public String verifyBooksMessage() {
        return getTextFromElement(booksMessage);
    }
    public void clickOnJewelryTab(){
        clickOnElement(jewelryTab);
    }
    public String verifyJewelryMessage() {
        return getTextFromElement(jewelryMessage);
    }
    public void clickOnGiftCardsTab(){
        clickOnElement(giftCardTab);
    }
    public String verifyGiftCardMessage() {
        return getTextFromElement(giftCardMessage);
    }
}


