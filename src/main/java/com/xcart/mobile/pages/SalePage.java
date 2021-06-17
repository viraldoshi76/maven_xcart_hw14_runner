package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.List;

public class SalePage extends Utility {

    By saleLink = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By sortByLink = By.xpath("//ul[@class='display-sort sort-crit grid-list']//li//a");
    By productList = By.xpath("//div[@class='items-list items-list-products sale-products']//h5");
    By priceListLowToHigh = By.xpath("//div[@class='items-list items-list-products sale-products']//span[@class='price product-price']");
    By rateListArranged = By.xpath("//div[@class='products']//div[@class='stars-row full']");
    By addToCartButton = By.xpath("(//span[text()='Add to cart'])[1]");
    By addToCartButtonMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeGreenBar = By.xpath("//a[@class='close']");
    By yourCartIcon = By.xpath("//div[@title='Your cart']");
    By viewCartButton = By.xpath("//span[contains(text(),'View cart')]");


    public String getTextTitleSalePage(){
        return getTextFromElement(waitUntilVisibilityOfElement(saleLink,50));
    }

    public void hooverAndClicktAToZSortByFromSalePage(String sortList) {
        Reporter.log("Mouse Hoover on SortBy Tab "+ sortBy.toString()+"<br>");
        mouseHoverToElement(sortBy);
        List<WebElement> sortByList = driver.findElements(sortByLink);
        for (WebElement list : sortByList) {
            Reporter.log("Getting List of SortBy Tab "+list.toString()+"Compart with sort list "+sortList.toString()+"<br>");
            if (list.getText().trim().equalsIgnoreCase(sortList)) {
                Reporter.log("Click on element from sortlist "+list.toString()+"<br>");
                clickOnElement(list);

                break;
            }
        }
    }

        public List<String> getProductNameList() throws InterruptedException {
            Reporter.log("Getting Product Name list "+productList.toString()+"<br>");
            return setProductNameList(productList);

        }

        public List<Double> getPriceList() throws InterruptedException {
            Reporter.log("Getting Price List "+priceListLowToHigh.toString()+"<br>");
            return setProductPriceList(priceListLowToHigh);

        }

        public List<Double> getRateList() throws InterruptedException {
            Reporter.log("Getting Rate List "+rateListArranged.toString()+"<br>");
            return setProductRateList(rateListArranged);
        }

        public void clickOnAddToCartButton(){
            Reporter.log("Click on Add to Cart "+addToCartButton.toString()+"<br>");
             clickOnElement(addToCartButton);
        }

        public String verifyMessageAddToCart(){
            Reporter.log("Gettig Add To Cart Message "+addToCartButton.toString()+"<br>");
            return getTextFromElement(addToCartButtonMessage);
        }

        public void clickOnGreenBarMessage(){
            Reporter.log("Click on Green bar "+closeGreenBar.toString()+"<br>");
            clickOnElement(closeGreenBar);
        }

        public void clickOnYourCartIcon(){
            Reporter.log("Click on Your Cart Icon "+yourCartIcon.toString()+"<br>");
            clickOnElement(yourCartIcon);
        }

        public void clickOnViewCartButton(){
            Reporter.log("Click on View Cart "+viewCartButton.toString()+"<br>");
            clickOnElement(viewCartButton);
        }

}
