package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TargetCheckOutPage extends Utility {

    By logInText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailAddress = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckOutText = By.xpath("//h1[@class='title']");
    By firstNameField = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastNameField = By.xpath("//input[@id='shippingaddress-lastname']");
    By addressField = By.xpath("//input[@id='shippingaddress-street']");
    By cityField = By.xpath("//input[@id='shippingaddress-city']");
    By countryField = By.xpath("//select[@id='shippingaddress-country-code']");
    By stateField = By.xpath("//input[@id='shippingaddress-custom-state']");
    By zipCodeField = By.xpath("//input[@id='shippingaddress-zipcode']");
    By emailField = By.xpath("//input[@id='email']");
    By createAnAccountForLaterUse = By.xpath("//input[@id='create_profile']");
    By passwordField = By.xpath("//input[@id='password']");
    By localShippingButton = By.xpath("//label[@title='Local shipping']//input[@id='method128']");
    By codButton = By.xpath("//input[@value='6']");
    By textTotal = By.xpath("//div[@class='total clearfix']");
    By submitButton = By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']");
    By thankYouText = By.xpath("//h1[@id='page-title']");

    public String setLogInText(){
        Reporter.log("Getting Log IN Text "+logInText.toString()+"<br>");
        return getTextFromElement(logInText);
    }

    public void enterEmailAddress(String email){
        Reporter.log("Enter Email Address "+email+"<br>");
        sendTextToElement(emailAddress,email);
    }

    public void clickOnContinueButton(){
        Reporter.log("click on Continue "+continueButton.toString()+"<br>");
        clickOnElement(continueButton);
    }

    public String setSecureCheckOutTitleText(){
        Reporter.log("Getting Secure CheckOut Title Text "+secureCheckOutText.toString()+"<br>");
        return getTextFromElement(secureCheckOutText);
    }

    public void enterFirstName(String fname){
        Reporter.log("Enter First name "+fname+"<br>");
        sendTextToElement(firstNameField,fname);
    }

    public void enterLastName(String lname){
        Reporter.log("Enter Last Name "+lname+"<br>");
        sendTextToElement(lastNameField,lname);
    }

    public void enterAddress(String adress){
        Reporter.log("Enter Address "+adress+"<br>");
        sendTextToElement(addressField,adress);
    }

    public void enterCity(String city){
        Reporter.log("Clear Text On Cit "+cityField.toString()+"Enter Text on City "+city+"<br>");
        clearTextSendText(cityField,city);
    }

    public void selectCountry(String value){
        Reporter.log("Click on counry list"+countryField.toString()+"Select from Drop Down list "+value+"<br>");
        selectByValueDropDown(countryField,value);
    }

    public void enterState(String state){
        Reporter.log("enter State"+state+"<br>");
        sendTextToElement(stateField,state);
    }

    public void enterZipCode(String zipcode){
        Reporter.log("Clear Text On Zipcode "+zipCodeField.toString()+"Enter Text on Zipcode"+zipcode+"<br>");
        clearTextSendText(zipCodeField,zipcode);
    }

    public void enterEmail(String emailaddress){
        Reporter.log("Clear Text on Email "+emailField.toString() +"Enter Text on Zipcode"+emailaddress+"<br>");
        clearTextSendText(emailField,emailaddress);
    }

    public void clickCreateAnAccountForLaterUse() throws InterruptedException {
        Reporter.log("Mouse Hoover and click on Create an Account "+createAnAccountForLaterUse.toString()+"<br>");
        Thread.sleep(2000);
       mouseHoverAndClickOnElement(createAnAccountForLaterUse);
    }

    public void enterPassword(String password){
        Reporter.log("Enter password "+password+"<br>");
        sendTextToElement(passwordField,password);
    }

    public void deliveryMethod(){
        Reporter.log("Mouse Hoover and clickon Local Shipping "+localShippingButton.toString()+"<br>");
        mouseHoverAndClickOnElement(localShippingButton);
    }

    public void paymentMethod(){
        Reporter.log("Mouse Hoover and click on COD"+codButton.toString()+"<br>");
        mouseHoverAndClickOnElement(codButton);
    }

    public String setTargetCheckOutPageTotal(){
        Reporter.log("Getting text from Total amount "+textTotal.toString()+"<br>");
        return getTextFromElement(textTotal);
    }

    public void clickOnPlaceOrderButton(){
        Reporter.log("click on Place order"+submitButton.toString()+"<br>");
        clickOnElement(submitButton);
    }

    public String setThankYouText(){
        Reporter.log("Getting Thankyou Text" +thankYouText.toString()+"<br>");
        return getTextFromElement(thankYouText);
    }


}
