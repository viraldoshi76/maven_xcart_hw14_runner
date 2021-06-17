package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TargetCartPage extends Utility {

    By verifyQuantity = By.xpath("//h1[@id='page-title']");
    By qtyChange = By.xpath("//input[@id='amount16']");
    By updateQtyChange = By.xpath("//h1[@id='page-title']");
    By subtotal = By.xpath("(//span[@class='cart-subtotal']//span[@class='surcharge-cell'])[1]");
    By total = By.xpath("//li[@class='total']//span[@class='surcharge-cell']");
    By goToCheckoutButton = By.xpath("//span[contains(text(),'Go to checkout')]");
    By emptycartButton = By.xpath("//a[@class='clear-bag']");
    By deleteTextMessage = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By emptyConfirmTextMessage = By.xpath("//h1[@id='page-title']");

    public String setTitleTextFromCartPage(){
        Reporter.log("Getting Qty Text from Cart page "+ verifyQuantity.toString()+"<br>");
        return getTextFromElement(verifyQuantity);
    }

    public void changeTheQuantity(String qty){
        Reporter.log("Clear Old qty"+qtyChange.toString()+"Enter new qty "+qty.toString()+"<br>");
        clearTextSendText(qtyChange,qty);
    }

    public String setTitleTextQtyChange(){
        Reporter.log("Getting Change Qty Text "+updateQtyChange.toString()+"<br>");
        return getTextFromElement(updateQtyChange);
    }

    public String setSubTotalText(){
        Reporter.log("Getting Subtotal Text "+subtotal.toString()+"<br>");
        return getTextFromElement(subtotal);
    }

    public String setTotalText(){
        Reporter.log("Getting Total Text "+total.toString()+"<br>");
        return getTextFromElement(total);
    }

    public void clickOnGoToCheckOutButton(){
        Reporter.log("Click on Go To CheckOut "+goToCheckoutButton.toString()+"<br>");
        clickOnElement(goToCheckoutButton);
    }

    public void clickOnEmptyCartButton(){
        Reporter.log("Click on Empty Cart "+emptycartButton.toString()+"<br>");
        clickOnElement(emptycartButton);
    }

    public String alertMessage(){
        Alert alert = driver.switchTo().alert();
        Reporter.log("Getting Alert message Text "+alert.toString()+"<br>");
        return alert.getText();
    }

    public void clickOnAlertMessage(){
        Alert alert =driver.switchTo().alert();
        Reporter.log("Click on Alert message "+alert.toString()+"<br>");
        alert.accept();
    }

    public String setConfirmTextFromGreenBar(){
        Reporter.log("Confirmation Text from Green bar "+deleteTextMessage.toString()+"<br>");
        return getTextFromElement(deleteTextMessage);
    }

    public String setEmptyMessage(){
        Reporter.log("Getting Empty Message "+emptyConfirmTextMessage.toString()+"<br>");
        return getTextFromElement(emptyConfirmTextMessage);
    }


}
