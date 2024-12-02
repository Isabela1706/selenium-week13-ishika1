package com.tricentis.demo.first.first.testsuite;

import com.tricentis.demo.first.first.testbase.BaseTest;
import com.tricentis.demo.first.pages.ElectronicsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicPage = new ElectronicsPage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {

        //Mouse Hover on the “ELECTRONICS” Tab
        electronicPage.mouseHoverOnElectronicTab();


        //Mouse Hover on the “Cell phones” and click
        electronicPage.mouseHoverOnCellPhone();


        //Verify the text “Cell phones”
        Thread.sleep(3000);

        String expectedText="Cell phones";
        String actualText=electronicPage.verifyTheTextOfCellPhones();
        Assert.assertEquals(actualText,expectedText,"Invalid Text");


    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        Thread.sleep(3000);

        //Mouse Hover on the “ELECTRONICS” Tab
        electronicPage.mouseHoverOnElectronicTab();

        //Mouse Hover on the “Cell phones” and click
        electronicPage.mouseHoverOnCellPhone();

        //Verify the text “Cell phones”
//        String expectedText="Cell phones";
//        String actualText=electronicPage.verifyTheTextOfCellPhones();
//        Assert.assertEquals(actualText,expectedText,"Invalid Text");


        //Click on the product name “Smartphone” link
        electronicPage.clickOnProductNameSmartPhoneLink();

        //Verify the text “Smartphone”
        String expectedTexts="Smartphone";
        String actualTexts=electronicPage.verifyTextSmartPhone();
        Assert.assertEquals(actualTexts,expectedTexts,"invalid text");


        //Verify the price “100.00”
        String exceptedPrice="100.00";
        String actualPrice=electronicPage.verifyThePrice();
        Assert.assertEquals(actualPrice,exceptedPrice,"Invalid Price");


        //Change the quantity to 2
        electronicPage.changeTheQty();
        electronicPage.changeTheQtyy();

        //Click on the “Add to cart” tab
        electronicPage.addToCartButton();


        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualMessage=electronicPage.verifyTheMessage();
        Assert.assertEquals(actualMessage,"The product has been added to your shopping cart","invalid message");



        //After that close the bar by clicking on the cross button.
        electronicPage.clickOnCrossButton();


        //Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        electronicPage.mouseHoveOnShoppingCartAndClick();


        //Verify the message "Shopping cart"
        String actualText1=electronicPage.verifyTheShoppingCart();
        Assert.assertEquals(actualText1,"Shopping cart","invalid Text");


        //Change the Qty to "2"
        electronicPage.changeTheQuan();


        //Click on "Update shopping cart"
        electronicPage.clickOnUpdateShoppingCart();


        //click on the checkbox “I agree with the terms of service”
        electronicPage.clickOnTheCheckbox();

        //Click on “Checkout”
        electronicPage.clickOnCheckOut();


        //Verify the Text “Welcome, Please Sign In!”
        String actualTextOfWelcome=electronicPage.verifyTheWelcomeText();
        Assert.assertEquals(actualTextOfWelcome,"Welcome, Please Sign In!","Invalid text");



        //Click on the “Register” tab
        electronicPage.clickOnRegisterTab();


        //Verify the text “Register”
        String actualTextOfRegister= electronicPage.verifyTheTextRegister();
        Assert.assertEquals(actualTextOfRegister,"Register","Invalid text");


        //Select the Male radio button
        electronicPage.selectOnMenButton();



        //Enter the First name
        electronicPage.enterFirstName("Alex");


        //Enter Last Name
        electronicPage.enterLastName("Patil");


        //Enter the Email
        electronicPage.enterEmail("AlexPatil@gamil.com");


        //Enter the Password
        electronicPage.enterPasswordInField("alex000");


        //Enter the Confirm password
        electronicPage.enterConfirmPasswordInField("alex000");


        //Click on the “Register” button
        electronicPage.clickOnRegisterButton();


        //Verify the message “Your registration completed”
        String actualMessageOfRegistration=electronicPage.verifyTheMessageRegister();
        Assert.assertEquals(actualMessageOfRegistration,"Your registration completed","invalid Text");


        //Click on the “Continue” button
        electronicPage.clickOnContinueButton();

        //Verify the text “Shopping card”
        String actualTextOfShoppingCard=electronicPage.verifyTheShoppingCardText();
        Assert.assertEquals(actualTextOfShoppingCard,"Shopping cart","Invalid Text");

        //click on the checkbox “I agree with the terms of service”
        electronicPage.clickOnCheckBox();



        //Click on the “Checkout”
        electronicPage.clickOnCheckOutButton();



        //Select the Country “United Kingdom” using the select class
        electronicPage.countryUsingSelectClass("United Kingdom");



        //Enter the city
        electronicPage.enterCity("London");


        //Enter the Address1
        electronicPage.enterAddress1("82 Epsom");


        //Enter the Zip/Postal code
        electronicPage.enterAddress1("kt1 8pe");


        //Enter the Phone number
        electronicPage.enterPhoneNumber("+447986738281");


        //Click on the “Continue” button
        electronicPage.clickOnContinueButton1();


        //Click on the “Continue” button
        electronicPage.clickOnContinueButton2();



        //Click on the Radio Button “2nd Day Air ($0.00)”
        electronicPage.clickOnRadioButton();



        //Click on the “Continue” button
        electronicPage.clickOnContinueButton3();


        //Select the Radio Button “Credit Card”
        electronicPage.selectOnRadioButtonCreditCard();


        //Click on the “Continue” button
        electronicPage.clickOnContinue();


        //Select “Master card” From the Select credit card dropdown using the Select class
        electronicPage.selectMasterCard();


        //Enter the Cardholder's name
        electronicPage.enterCardholderName("Alex");


        //Enter the Card number
        electronicPage.enterCardNumber("5283604144086333");


        //Select the Expiration date using the select class
        electronicPage.selectDate();



        //Enter the code
        electronicPage.enterCardCode("690");


        //Click on the “Continue” button
        electronicPage.clickOnContinueButton4();


        //Verify the “Payment Method” is “Credit Card”
        String actualMethodOfPayment=electronicPage.verifyTheMethodOfPayment();
        Assert.assertEquals(actualMethodOfPayment,"Credit Card","invalid method");


        //Verify the “Shipping Method” is “2nd Day Air”
        String actualMethodOfShopping=electronicPage.verifyTheShoppingMethod();
        Assert.assertEquals(actualMethodOfShopping,"2nd Day Air","Invalid Method");


        //Click on the “Confirm” button
        electronicPage.clickOnConfirmButton();



        //Verify the Text “Thank You”
        String actualTextOfThankYou=electronicPage.verifyTextThanYou();
        Assert.assertEquals(actualTextOfThankYou,"Thank you","Invalid Text");

        //Verify the message “Your order has been successfully processed!”
        String actualMessageOfProcessed=electronicPage.verifyTheProcessMessage();
        Assert.assertEquals(actualMessageOfProcessed,"Your order has been successfully processed!","Invalid Message");



        //Click on the “Continue” button
        electronicPage.clickOnContinueButton6();


        //Verify the text “Welcome to our Store”
        String actualWelComeText=electronicPage.verifyTheWelComeStore();
        Assert.assertEquals(actualWelComeText,"Welcome to our store","Invalid text");


        //Click on the “Logout” link
        electronicPage.clickOnLoginLink();









    }


}
