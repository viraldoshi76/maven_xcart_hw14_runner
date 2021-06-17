package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class NewArrivalPage extends Utility {

    By pageTitleText=By.xpath("//h1[@id='page-title']");

    public String getTitleTextFromNewArrivalsPage(){
        Reporter.log("Getting New Arrival Title Text "+pageTitleText.toString()+"<br>");
        return getTextFromElement(pageTitleText);
    }
}
