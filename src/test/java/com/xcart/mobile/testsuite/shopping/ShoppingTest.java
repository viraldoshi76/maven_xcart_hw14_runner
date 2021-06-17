package com.xcart.mobile.testsuite.shopping;

import com.xcart.mobile.pages.*;
import com.xcart.mobile.testBase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShoppingTest extends TestBase {


    SoftAssert softAssert=new SoftAssert();
    SalePage salePage = new SalePage();
    HomePage homePage = new HomePage();
    TargetCartPage targetCartPage = new TargetCartPage();
    TargetCheckOutPage targetCheckOutPage = new TargetCheckOutPage();
    BestSellers bestSellers = new BestSellers();

    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        Thread.sleep(2000);
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Sale");
        String expectedSalePageTitleText = "Sale";
        Thread.sleep(2000);
        String actualSalePageTitleText = salePage.getTextTitleSalePage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedSalePageTitleText,actualSalePageTitleText);
        salePage.hooverAndClicktAToZSortByFromSalePage("Name A - Z");
        Thread.sleep(2000);
        salePage.clickOnAddToCartButton();
        String expectedAddToCartMessage = "Product has been added to your cart";
        String actualAddToCartMessage = salePage.verifyMessageAddToCart();
        softAssert.assertEquals(expectedAddToCartMessage,actualAddToCartMessage);
        Thread.sleep(2000);
        salePage.clickOnGreenBarMessage();
        Thread.sleep(2000);
        salePage.clickOnYourCartIcon();
        Thread.sleep(2000);
        salePage.clickOnViewCartButton();
        Thread.sleep(2000);
        String expectedCartPageTitleText = "Your shopping cart - 1 item";
        String actualCartPageTitleText = targetCartPage.setTitleTextFromCartPage();
        softAssert.assertEquals(expectedCartPageTitleText,actualCartPageTitleText);
        Thread.sleep(2000);
        targetCartPage.changeTheQuantity("2");
        String expectedTitleTextQtyChange = "Your shopping cart - 2 items";
        String actualTitleTextQtyChange = targetCartPage.setTitleTextQtyChange();
        softAssert.assertEquals(expectedTitleTextQtyChange,actualTitleTextQtyChange);
        Thread.sleep(2000);
        String expectedSubTotal = "$29.98";
        String actualSubTotal = targetCartPage.setSubTotalText();
        softAssert.assertEquals(expectedSubTotal,actualSubTotal);
        Thread.sleep(2000);
        String expectedTotal = "$36.00";
        String actualTotal = targetCartPage.setTotalText();
        softAssert.assertEquals(expectedTotal,actualTotal);
        Thread.sleep(2000);
        targetCartPage.clickOnGoToCheckOutButton();
        Thread.sleep(2000);
        String expectedLogInText = "Log in to your account";
        String actualLogInText = targetCheckOutPage.setLogInText();
        softAssert.assertEquals(expectedLogInText,actualLogInText);
        Thread.sleep(2000);
        targetCheckOutPage.enterEmailAddress("five96@gmail.com");
        targetCheckOutPage.clickOnContinueButton();
        Thread.sleep(2000);
        String expectedSecureCheckOutText = " Secure Checkout";
        String actualSecureCheckOutText = targetCheckOutPage.setSecureCheckOutTitleText();
        softAssert.assertEquals(expectedSecureCheckOutText,actualSecureCheckOutText);
        Thread.sleep(2000);
        targetCheckOutPage.enterFirstName("Rocky");
        targetCheckOutPage.enterLastName("Campbell");
        targetCheckOutPage.enterAddress("125 Charles Road");
        targetCheckOutPage.enterCity("Manchester");
        targetCheckOutPage.selectCountry("GB");
        targetCheckOutPage.enterState("FourOaks");
        targetCheckOutPage.enterZipCode("MC12 5KL");
        //targetCheckOutPage.enterEmail("rocky@gmail.com");
        Thread.sleep(2000);
        targetCheckOutPage.clickCreateAnAccountForLaterUse();
        Thread.sleep(2000);
        targetCheckOutPage.enterPassword("klPoe8752");
        targetCheckOutPage.deliveryMethod();
        Thread.sleep(2000);
        targetCheckOutPage.paymentMethod();
        Thread.sleep(2000);
        String expectedTargetCheckOutPageTotal = "$37.03";
        String actualTargetCheckOutPageTotal = targetCheckOutPage.setTargetCheckOutPageTotal();
        softAssert.assertEquals(expectedTargetCheckOutPageTotal,actualTargetCheckOutPageTotal);
        Thread.sleep(2000);
        targetCheckOutPage.clickOnPlaceOrderButton();
        Thread.sleep(2000);
        String expectedThankyouText= "Thank you for your order";
        String actualThankyouText = targetCheckOutPage.setThankYouText();
        softAssert.assertEquals(expectedThankyouText,actualThankyouText);
    }

    @Test(groups = {"sanity","regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        homePage.hooverOnHotDealsTab();
        Thread.sleep(2000);
        homePage.hooverAndClickOnDropDownOfHotDealsMenu("Bestsellers");
        String expectedBestSellersPageTitleText = "Bestsellers";
        Thread.sleep(2000);
        String actualBestSellersPageTitleText = bestSellers.getTextTitleBestSellerPage();
        Thread.sleep(2000);
        softAssert.assertEquals(expectedBestSellersPageTitleText,actualBestSellersPageTitleText);
        bestSellers.hooverAndClicktZToASortByFromBestSellerPage("Name A - Z");
        Thread.sleep(2000);
        bestSellers.clickOnVinylIdolzGhostbusters();
        Thread.sleep(2000);
        String expectedAddToCartMessage = "Product has been added to your cart";
        String actualAddToCartMessage = bestSellers.verifyMessageAddToCart();
        softAssert.assertEquals(expectedAddToCartMessage,actualAddToCartMessage);
        Thread.sleep(2000);
        bestSellers.clickOnGreenBarMessage();
        bestSellers.clickOnYourCartIcon();
        Thread.sleep(2000);
        bestSellers.clickOnViewCartButton();
        Thread.sleep(2000);
        String expectedCartPageTitleText = "Your shopping cart - 1 item";
        String actualCartPageTitleText = targetCartPage.setTitleTextFromCartPage();
        softAssert.assertEquals(expectedCartPageTitleText,actualCartPageTitleText);
        Thread.sleep(2000);
        targetCartPage.clickOnEmptyCartButton();
        Thread.sleep(2000);
        String expectedAlertMessage = "Are you sure you want to clear your cart?";
        String actualAlertMessage = targetCartPage.alertMessage();
        softAssert.assertEquals(expectedAlertMessage,actualAlertMessage);
        Thread.sleep(2000);
        targetCartPage.clickOnAlertMessage();
        Thread.sleep(2000);
        String expectedDeleteMessage = "Item(s) deleted from your cart";
        String actualDeletteMessage = targetCartPage.setConfirmTextFromGreenBar();
        softAssert.assertEquals(expectedDeleteMessage,actualDeletteMessage);
        targetCartPage.clickOnAlertMessage();
        Thread.sleep(2000);
        String expectedEmptyMessage = "Your cart is empty";
        String actualEmptyMessage = targetCartPage.setEmptyMessage();
        softAssert.assertEquals(expectedEmptyMessage,actualEmptyMessage);

    }
}
