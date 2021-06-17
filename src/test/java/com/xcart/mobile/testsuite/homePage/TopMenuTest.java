package com.xcart.mobile.testsuite.homePage;

import com.xcart.mobile.pages.*;
import com.xcart.mobile.testBase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TopMenuTest extends TestBase {

        HomePage homePage = new HomePage();
        ShippingPage shippingPage = new ShippingPage();
        NewArrivalPage newArrivalPage = new NewArrivalPage();
        ComingSoon comingSoonPage = new ComingSoon();
        ContactUsPage contactUsPage = new ContactUsPage();
        SoftAssert softAssert=new SoftAssert();

        @Test(groups = {"sanity","smoke","regression"})
        public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
                homePage.selectTopMenuTab("Shipping");
                Thread.sleep(5000);
                String expectedShippingPageTitleText="Shipping";
                Thread.sleep(5000);
                String actualShippingPageTitleText=shippingPage.getTitleTextFromShippingPage();
                softAssert.assertEquals(expectedShippingPageTitleText,actualShippingPageTitleText);
         }

        @Test(groups = {"smoke","sanity","regression"})
        public void verifyUserShouldNavigateToNewPageSuccessfully(){

                homePage.selectTopMenuTab("New!");
                String expectedNewArrivalsPageTitleText="New arrivals";
                String actualNewArrivalsPageTitleText=newArrivalPage.getTitleTextFromNewArrivalsPage();
                softAssert.assertEquals(expectedNewArrivalsPageTitleText,actualNewArrivalsPageTitleText);
        }

        @Test(groups = {"sanity","smoke","regression"})
        public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
                homePage.selectTopMenuTab("Coming soon");
                String expectedComingSoonPageTitleText="Coming soo";//fail test to check the report
                String actualCommingSoonPageTitleText = comingSoonPage.getTextTitleCommingSoonPage();
                softAssert.assertEquals(actualCommingSoonPageTitleText,expectedComingSoonPageTitleText);
        }

        @Test(groups = {"sanity","smoke","regression"})
        public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
                homePage.selectTopMenuTab("Contact us");
                String expectedContactUsPageTitleText="Contact us";
                String actualCommingSoonPageTitleText = contactUsPage.getTextTitleContactUsPage();
                softAssert.assertEquals(actualCommingSoonPageTitleText,expectedContactUsPageTitleText);
        }
}

