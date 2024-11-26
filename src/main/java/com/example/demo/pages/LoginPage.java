package com.example.demo.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoginPage {
    String userId;
    String pwd;
    String env;

    @Autowired
    WebDriver driver;

    @Autowired
    HomePage homePage;

    public LoginPage(){
        System.out.println("Login Page default construt is being called");
    }

    @PostConstruct
    public void initWebDriver(){
        System.out.println("Login Page POST CONSTRUCT  is being called");
        PageFactory.initElements(driver, this);
    }

    public LoginPage(String userId, String pwd, String env){
        this.userId = userId;
        this.pwd = pwd;
        this.env = env;

    }

    public HomePage login(){
        System.out.println("User logged in with userid:"+userId+" password:"+pwd+ " in env"+ env);
        System.out.println("Driver in Login page is "+driver.toString());
        return homePage;
    }
}
