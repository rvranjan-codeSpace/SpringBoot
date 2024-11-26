package com.example.demo.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage {
    @Autowired
    WebDriver driver;

    public HomePage(){
        System.out.println("Home Page default Method is being called");

    }

    @PostConstruct
    public void initWebDriver(){
        System.out.println("Home Page POST CONSTRUCT  is being called");
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        driver.getTitle();
        System.out.println("Driver in HOme page is "+driver.toString());
        return "Title of the homePage is :"+"Flipkart";
    }
}

