package com.example.demo;

import com.example.demo.pages.HomePage;
import com.example.demo.pages.LoginPage;
import com.example.demo.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class TestMainPage {

    @Value("http://www.google.com")
    String url;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    WebDriver driver;


    @Autowired
    MainPage mainPage;

    @Autowired
    HomePage homePage;

    @Test
    public void testMainPage() throws InterruptedException {
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Beans loaded in ApplicationContext:");
        for (String beanName : beanNames) {
            Class<?> beanClass = applicationContext.getType(beanName);
            if (beanClass != null && beanClass.getPackageName().startsWith("com.example")) {
                System.out.println(beanName + " -> " + beanClass.getName());
            }

        }
        System.out.println("Testing MainPage with URL"+ url);
        //MainPage mainPage = new MainPage("QA","234");
        driver.get(url);
        Thread.sleep(1000);
        LoginPage  loginPage= mainPage.navigateToLoginPage();
        HomePage homePage= loginPage.login();
        String title = homePage.getTitle();
        System.out.println("Title = "+title);
    }
}
