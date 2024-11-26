package com.example.demo.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/* SInce Main Page has env and id as the parameter , we get this error:
No qualifying bean of type 'java.lang.String' available: expected at least
So adding this defualt values or this can be added from a properties file


 */
@Component
public class MainPage {
    String env;
    String id;

    @Autowired
    WebDriver driver;

    @Autowired
    LoginPage loginPage;

    public MainPage(String env, String id){
        System.out.println("Main page custom constructor is being called");
        this.env = env;
        this.id = id;
    }

    public MainPage(){
        System.out.println("Main page default constructor is being called");

    }

    @PostConstruct
    public void initWebdriver(){
        System.out.println("Main page POST CONSTRUCT is being called");
        PageFactory.initElements(driver, this);
    }


    public LoginPage navigateToLoginPage(){
        System.out.println("Clicking on login button to naviagate to Login Page");
        System.out.println("Driver in Main page is "+driver.toString());
        return loginPage;
    }
}
