package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ContactUsPage extends Utility {

    By pageTitleText = By.xpath("//h1[@id='page-title']");

    public String getTextTitleContactUsPage(){
        Reporter.log("Getting Contact Page Title Text "+pageTitleText.toString()+"<br>");
        return getTextFromElement(waitUntilVisibilityOfElement(pageTitleText,50));
    }
}
