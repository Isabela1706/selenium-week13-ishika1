package com.tricentis.demo.first.pages;

import com.tricentis.demo.first.utilites.Utilities;
import org.openqa.selenium.By;

public class HomePage extends Utilities {


    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);

    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}
