package com.stepdefinition.RLL_240Testing_FirstCry_Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_Login.HomePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition_Home {
	WebDriver driver;
	HomePage home;
	 Logger log1; 
 
	@Before
	public void init() {
		driver = new ChromeDriver();
		home = new HomePage(driver);
		log1= Logger.getLogger(StepDefinition_Home.class);
	}
	
	@Given("The user is to enter the FirstCry Home Page")
    public void the_user_is_to_enter_the_FirstCry_Home_Page() throws InterruptedException {
        home.LaunchFirstCry();
        driver.manage().window().maximize();
        log1.info("pass browser maximized");
        Thread.sleep(1000);
    }

    @When("The user then clicks on login button")
    public void the_user_then_clicks_on_login_button() throws InterruptedException {
        home.loginbuttonclick();
        log1.info("The user then clicks on login button");
        
        Thread.sleep(1000);
    }

    @Then("The user enters the login page of firstcry app")
    public void the_user_enters_the_login_page_of_firstcry_app() {
        WebElement exp4 = driver.findElement(By.xpath("//p[contains(text(),'Log In/Register')]"));
        Assert.assertEquals(exp4.getText(), "Log In/Register");
    }
}