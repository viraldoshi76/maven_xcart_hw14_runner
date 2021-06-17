package com.xcart.mobile.testsuite.hotDeals;

import com.xcart.mobile.pages.BestSellers;
import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.SalePage;
import com.xcart.mobile.testBase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealsTest extends TestBase {

    SoftAssert softAssert=new SoftAssert();
    SalePage salePage = new SalePage();
    HomePage homePage = new HomePage();
    BestSellers bestSellers = new BestSellers();

    @Test(groups = {"smoke","regression"})
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Sale");
        String expectedSalePageTitleText = "Sale";
        Thread.sleep(2000);
        String actualSalePageTitleText = salePage.getTextTitleSalePage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedSalePageTitleText,actualSalePageTitleText);
        salePage.hooverAndClicktAToZSortByFromSalePage("Name A - Z");
        Thread.sleep(2000);
        List<String> actualProductNameList = salePage.getProductNameList();
        List<String> expectedProductNameList = new ArrayList<>(actualProductNameList);
        Collections.sort(expectedProductNameList);
        softAssert.assertEquals(expectedProductNameList,actualProductNameList);

    }

    @Test(groups = {"smoke","regression"})
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Sale");
        String expectedSalePageTitleText = "Sale";
        Thread.sleep(2000);
        String actualSalePageTitleText = salePage.getTextTitleSalePage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedSalePageTitleText,actualSalePageTitleText);
        salePage.hooverAndClicktAToZSortByFromSalePage("Price Low - High");
        Thread.sleep(2000);
        List<Double> actualPriceList = salePage.getPriceList();
        List<Double> expectedPriceList = new ArrayList<>(actualPriceList);
        Collections.sort(expectedPriceList);
        softAssert.assertEquals(expectedPriceList,actualPriceList);
    }

    @Test(groups = {"smoke","regression"})
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Sale");
        String expectedSalePageTitleText = "Sale";
        Thread.sleep(2000);
        String actualSalePageTitleText = salePage.getTextTitleSalePage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedSalePageTitleText,actualSalePageTitleText);
        salePage.hooverAndClicktAToZSortByFromSalePage("Rates");
        Thread.sleep(2000);
        List<Double> actualRatesArranged = salePage.getRateList();
        List<Double> expectedRatesArranged = new ArrayList<>(actualRatesArranged);
        Collections.sort(expectedRatesArranged,Collections.reverseOrder());
        softAssert.assertEquals(expectedRatesArranged,actualRatesArranged);
    }

    @Test(groups = {"smoke","regression"})
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Bestsellers");
        String expectedBestSellersPageTitleText = "Bestsellers";
        Thread.sleep(2000);
        String actualBestSellersPageTitleText = bestSellers.getTextTitleBestSellerPage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedBestSellersPageTitleText,actualBestSellersPageTitleText);
        bestSellers.hooverAndClicktZToASortByFromBestSellerPage("Name Z - A");
        Thread.sleep(2000);
        List<String> actualProductNameList = bestSellers.getProductNameList();
        List<String> expectedProductNameList = new ArrayList<>(actualProductNameList);
        Collections.sort(expectedProductNameList,Collections.reverseOrder());
        softAssert.assertEquals(expectedProductNameList,actualProductNameList);
    }

    @Test(groups = {"smoke","regression"})
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Bestsellers");
        String expectedBestSellersPageTitleText = "Bestsellers";
        Thread.sleep(2000);
        String actualBestSellersPageTitleText = bestSellers.getTextTitleBestSellerPage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedBestSellersPageTitleText,actualBestSellersPageTitleText);
        bestSellers.hooverAndClicktZToASortByFromBestSellerPage("Price High - Low");
        Thread.sleep(2000);
        List<Double> actualPriceList = bestSellers.getPriceList();
        List<Double> expectedPriceList = new ArrayList<>(actualPriceList);
        Collections.sort(expectedPriceList,Collections.reverseOrder());
        softAssert.assertEquals(expectedPriceList,actualPriceList);
    }

    @Test(groups = {"smoke","regression"})
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Bestsellers");
        String expectedBestSellersPageTitleText = "Bestsellers";
        Thread.sleep(2000);
        String actualBestSellersPageTitleText = bestSellers.getTextTitleBestSellerPage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedBestSellersPageTitleText,actualBestSellersPageTitleText);
        bestSellers.hooverAndClicktZToASortByFromBestSellerPage("Rates");
        Thread.sleep(2000);
        List<Double> actualRatesArranged = bestSellers.getRateList();
        List<Double> expectedRatesArranged = new ArrayList<>(actualRatesArranged);
        Collections.sort(expectedRatesArranged,Collections.reverseOrder());
        softAssert.assertEquals(expectedRatesArranged,actualRatesArranged);
    }



}
