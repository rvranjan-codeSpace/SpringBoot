package com.example.demo;

import com.example.demo.pages.LoginPage;
import com.example.demo.pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MainPage mainPage() {
        return new MainPage("production", "main123");
    }


    @Bean
    public WebDriver webDriverLib(){
        System.setProperty("webdriver.chrome.driver","/Users/rajranjan/Documents/Dens/demo-spring-learn/src/main/resources/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        return driver;

    }
}
