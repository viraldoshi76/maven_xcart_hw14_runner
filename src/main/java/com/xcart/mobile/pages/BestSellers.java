package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

public class BestSellers extends Utility {

    By saleLink = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By sortByLink = By.xpath("//ul[@class='display-sort sort-crit grid-list']//li//a");
    By priceListHighToLow = By.xpath("//div[@class='items-list items-list-products sale-products']//span[@class='price product-price']");
    By productList = By.xpath("//div[@class='items-list items-list-products sale-products']//h5");
    By rateListArranged = By.xpath("//div[@class='products']//div[@class='stars-row full']");
    By vinylIdolzGhostbustersAddToCartButton = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By addToCartButtonMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeGreenBar = By.xpath("//a[@class='close']");
    By yourCartIcon = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.xpath("//span[contains(text(),'View cart')]");




    public String getTextTitleBestSellerPage(){
        Reporter.log("Getting page Title Text"+ saleLink.toString()+"<br>");

        return getTextFromElement(waitUntilVisibilityOfElement(saleLink,50));
    }

    public void hooverAndClicktZToASortByFromBestSellerPage(String sortList) {
        Reporter.log("Mouse Hoover on Sort by filter Link"+sortBy.toString()+"<br>");

        mouseHoverToElement(sortBy);

        List<WebElement> sortByList = driver.findElements(sortByLink);
        for (WebElement list : sortByList) {
            Reporter.log("Getting text from element"+ list.toString()+"compare with sortlist"+sortList+"<br>");
            if (list.getText().trim().equalsIgnoreCase(sortList)) {
                Reporter.log("Clicking on element"+list.toString()+"<br>");
                clickOnElement(list);

                break;
            }
        }
    }

    public List<Double> getPriceList() throws InterruptedException {
        Reporter.log("Getting Price lilst"+priceListHighToLow.toString()+"<br>");
        return setProductPriceList(priceListHighToLow);

    }

    public List<String> getProductNameList() throws InterruptedException {
        Reporter.log("Getting Product list"+ productList.toString()+"<br>");

        return setProductNameList(productList);

    }

    public List<Double> getRateList() throws InterruptedException {
        Reporter.log("Getting Rate List "+rateListArranged.toString()+ "<br>");
        return setProductRateList(rateListArranged);
    }

    public void clickOnVinylIdolzGhostbusters(){
        Reporter.log("click On vinylIdolzGhostbusters"+vinylIdolzGhostbustersAddToCartButton.toString()+"<br>");

        mouseHoverAndClickOnElement(vinylIdolzGhostbustersAddToCartButton);
    }

    public String verifyMessageAddToCart(){
        Reporter.log("Getting Message on Add to Cart"+ addToCartButtonMessage.toString()+"<br>");
        return getTextFromElement(addToCartButtonMessage);
    }


    public void clickOnGreenBarMessage(){
        Reporter.log("Click on Green bar"+closeGreenBar.toString()+"<br>");
        clickOnElement(closeGreenBar);
    }

    public void clickOnYourCartIcon(){
        Reporter.log("Click on Cart Icon"+ yourCartIcon.toString() +"<br>");
        clickOnElement(yourCartIcon);
    }

    public void clickOnViewCartButton(){
        Reporter.log("Click on View Cart " +viewCartButton.toString()+"<br>");
        clickOnElement(viewCartButton);
    }




}
