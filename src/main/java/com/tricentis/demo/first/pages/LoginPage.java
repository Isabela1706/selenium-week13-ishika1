package com.tricentis.demo.first.pages;

import com.tricentis.demo.first.utilites.Utilities;
import org.openqa.selenium.By;

public class LoginPage extends Utilities {


    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//input[@value='Log in']");
    By errorMessage = By.xpath("//div[@class='validation-summary-errors']");





    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField, email);

    }
    public void enterPasswordInField(String password){
        sendTextToElement(passwordField, password);

    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
