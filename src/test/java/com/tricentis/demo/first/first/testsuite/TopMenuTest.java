package com.tricentis.demo.first.first.testsuite;

import com.tricentis.demo.first.first.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    @Test
    public void selectMenu(String Menu){
        //create a method with the name "selectMenu" It has one parameter named "menu" of type string
        System.out.println("Clicking on Menu" +Menu);

    }
    @Test
    public void verifyPageNavigation(){
        //create the @Test method name verifyPageNavigation(). Use the selectMenu
        //method to select the Menu click on it and verify the page navigation.

    }
}
