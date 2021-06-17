package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShippingPage extends Utility {

    By pageTitleText=By.xpath("//h1[@id='page-title']");

    public String getTitleTextFromShippingPage() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("Getting Shipping Page Title Text "+pageTitleText.toString()+"<br>");
        return getTextFromElement(pageTitleText);
    }
}
