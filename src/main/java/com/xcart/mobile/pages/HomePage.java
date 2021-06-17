package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.omg.PortableServer.RequestProcessingPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    By topMenuTab = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span");
    /*By homeLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Home']");
    By hotDealsLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']");
    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Shipping']");*/
    By hotDealsLink = By.xpath("(//li[@class='leaf has-sub']/child::span[text()='Hot deals'])[2]");
    By saleLink = By.xpath("(//span[text()='Sale'])[2]");
    By hotDealsDropDownLink = By.xpath("//li[@class='leaf has-sub']/ul/li");



    By welcomeText=By.xpath("//h1[contains(text(),'Welcome to X-Cart Demo Store!')]");

    public void selectTopMenuTab(String menu) {
        List<WebElement> menuList = driver.findElements(topMenuTab);
        for (WebElement element : menuList) {
            Reporter.log("Getting list of top Menu "+ menu.toString()+"<br>");
            if (element.getText().equalsIgnoreCase(menu)) {
                Reporter.log("Click on Element "+ element.toString()+"<br>");
                element.click();
                break;
            }
        }
    }

    public String getActualText() {
        Reporter.log("Getting Actual Welcome Text "+ welcomeText.toString()+"<br>");
        return getTextFromElement(waitUntilVisibilityOfElement(welcomeText,50));
    }

    public void hooverOnHotDealsTab(){
        Reporter.log("Mouse Hoover on Hot Deals Tab "+hotDealsLink.toString()+"<br>");
        mouseHoverToElement(hotDealsLink);
    }

    public void hooverAndClickOnDropDownOfHotDealsMenu(String hotDealTab){
        List<WebElement> hotDealList = driver.findElements(hotDealsDropDownLink);
        for (WebElement list:hotDealList) {
            Reporter.log("Getting list of Hot Deals Tab "+list.toString()+"compare with Hot Deal list"+hotDealTab.toString()+"<br>");
            if (list.getText().equalsIgnoreCase(hotDealTab)){
                Reporter.log("Mouse Hoover and Click on Element "+list.toString()+"<br>");
               mouseHoverAndClickOnElement(list);
                break;
            }

        }
    }
}
