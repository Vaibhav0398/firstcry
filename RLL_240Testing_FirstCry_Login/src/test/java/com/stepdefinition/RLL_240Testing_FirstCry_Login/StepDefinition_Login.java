package com.stepdefinition.RLL_240Testing_FirstCry_Login;
 
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.RLL_240Testing_FirstCry_Login.HomePage;
import com.pages.RLL_240Testing_FirstCry_Login.LoginPage; 
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class StepDefinition_Login {
	WebDriver driver;
	LoginPage login;
	HomePage home;

	@Before
	public void init() {
		driver = new ChromeDriver();
		home = new HomePage(driver);
		login = new LoginPage(driver);
	}
	
	@Given("The user navigates to FirstCry Home Page")
    public void the_user_navigates_to_FirstCry_Home_Page() throws InterruptedException {
        home.LaunchFirstCry();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @When("The user clicks on login")
    public void the_user_clicks_on_login() throws InterruptedException {
        home.loginbuttonclick();
        Thread.sleep(1000);
    }

    @When("^The user enters the (.*) or mobile no.$")
    public void the_user_enters_the_email_id_or_mobile_no(String EmailID) throws InterruptedException {
        login.enterUserName(EmailID);
        Thread.sleep(1000);
    }

    @When("The user clicks on Continue")
    public void the_user_clicks_on_continue() throws InterruptedException {
        login.clickContinueButton();
        Thread.sleep(31000);
    }

    @When("Click on Submit")
    public void click_on_submit() {
        login.clickSubmitButton();
    }
    @Then("The user gets a message that user is on home page")
    public void the_user_gets_a_message_that_user_is_on_home_page() {
        // Check for the "My Account" message indicating a successful login
        try {
            WebElement homePageMessage = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
            String actualHome = homePageMessage.getText();
            Assert.assertEquals(actualHome, "My Account", "User is not on the home page.");
        } catch (NoSuchElementException e) {
            Assert.fail("Expected message 'My Account' was not found on the home page.");
        }
        try {
            WebElement registerMessage = driver.findElement(By.xpath("//p[contains(text(),'Register')]"));
            String actualRegister = registerMessage.getText();
            Assert.assertEquals(actualRegister, "Register", "Expected 'Register' message not displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail("Expected message 'Register' was not found.");
        }
        try {
            WebElement nullMessage = driver.findElement(By.xpath("//p[contains(text(),'Please enter Email-Id or Mobile No.')]"));
            String actualNull = nullMessage.getText();
            Assert.assertEquals(actualNull, "Please enter Email-Id or Mobile No.", "Expected null input message not displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail("Expected message for null input was not found.");
        }
        try {
            WebElement invalidOTPMessage = driver.findElement(By.xpath("//p[contains(text(),'Invalid OTP. Please try again.')]"));
            String actualOTP = invalidOTPMessage.getText();
            Assert.assertEquals(actualOTP, "Invalid OTP. Please try again.", "Expected invalid OTP message not displayed.");
        } catch (NoSuchElementException e) {
            Assert.fail("Expected message for invalid OTP was not found.");
        }
    }

//    // Separate method for handling invalid input message
//    @Then("The user gets a message for invalid input")
//    public void the_user_gets_a_message_for_invalid_input() {
//        
//    }
//
//    // Separate method for handling null input message
//    @Then("The user gets a message for null input")
//    public void the_user_gets_a_message_for_null_input() {
//        
//    }
//
//    // Separate method for handling invalid OTP message
//    @Then("The user gets a message for invalid OTP")
//    public void the_user_gets_a_message_for_invalid_otp() {
//        
//    }

//    @Then("The user gets a message that user is on home page")
//    public void the_user_gets_a_message_that_user_is_on_home_page() {
// 
//    	WebElement homePageMessage = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
//    	WebElement registorMessage = driver.findElement(By.xpath("//p[contains(text(),'Register')]"));
//    	WebElement nullMessage = driver.findElement(By.xpath("//p[contains(text(),'Please enter Email-Id or Mobile No.')]"));
//    	WebElement invalidOTP = driver.findElement(By.xpath("//p[contains(text(),'Invalid OTP. Please try again.')]"));
//        String actualhome = homePageMessage.getText();
//        String actualinvalid = registorMessage.getText();
//        String actualnull = nullMessage.getText();
//        String actualOTP = invalidOTP.getText();
//     // Valid input
//        if (actualhome.equals("My Account")) {
//            Assert.assertEquals(actualhome, "My Account", "Valid input: User is on the home page.");
//        }
//        else {
//            Assert.fail("Unexpected state: None of the expected messages were displayed.");
//        }
//     // Invalid input
//        if (actualinvalid.equals("Register")) {
//            Assert.assertEquals(actualinvalid, "Register", "Invalid input");
//        } 
//        else {
//            Assert.fail("Unexpected state: None of the expected messages were displayed.");
//        }
//        // Null or empty input
//        if (actualnull.equals("Please enter Email-Id or Mobile No.")) {
//            Assert.assertEquals(actualnull, "Please enter Email-Id or Mobile No.", "Null input");
//        } 
//        else {
//            Assert.fail("Unexpected state: None of the expected messages were displayed.");
//        }
//        // Any other unexpected input
//        if (actualOTP.equals("Invalid OTP. Please try again.")){
//            Assert.assertEquals(actualOTP, "Invalid OTP. Please try again.", "invalid OTP");
//        }
//        else {
//            Assert.fail("Unexpected state: None of the expected messages were displayed.");
//        }
//    }
}
 
