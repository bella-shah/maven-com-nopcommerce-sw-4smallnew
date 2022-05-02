package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerLink = By.linkText("Register");
    By genderRadio = By.xpath("//input[@id='gender-female']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirth = By.name("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By emailAddress = By.xpath("//input[@id='Email']");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By errorMessage = By.xpath("//div[contains(text(),'Your registration completed')]");
    By registerMessage = By.xpath("//div[@class='page-title']");
    By registerCompleteMessage = By.xpath("//div[contains(text(),'Your registration completed')]");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnGenderRadio(){
        clickOnElement(genderRadio);
    }
    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }
    public void selectDayOfBirth(String day){
        selectByValueFromDropDown(dateOfBirth, day);
    }public void selectMonthOfBirth(String month){
        selectByValueFromDropDown(monthOfBirth, month);
    }
    public void selectYearOfBirth(String year){
        selectByValueFromDropDown(yearOfBirth,year);
    }
    public void enterEmailAddress(String email){
        sendTextToElement(emailAddress,email);
    }
    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
    } public void enterConfirmPassword(String password2) {
        sendTextToElement(confirmPassword, password2);
    }
    public void clickOnRegisterBtn(){
        clickOnElement(registerBtn);
    }
    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
    public String getRegisterMessage() {
        return getTextFromElement(registerMessage);
    }
    public String getRegisterCompleteMessage() {
        return getTextFromElement(registerCompleteMessage);
    }
}


