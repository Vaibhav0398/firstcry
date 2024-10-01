package com.pages.RLL_240Testing_FirstCry_Login;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class LoginPage {
	WebDriver driver;
 
	By LoginButton = By.xpath("//span[@class=\"anch poplogin_main poplogin R12_61\"]");
	By Email_Mob_Box = By.xpath("//input[@id=\"lemail\"]");
	By ContinueButton = By.xpath("//span[@class=\"J14SB_42 cl_fff\"]");
	By OTPBox = By.xpath("//input[contains(@id,'notp0')]");
	By SubmitButton = By.xpath("//*[text()='SUBMIT']");
	
	
 
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
//	public void LaunchFirstCry()
//	{
//		driver.get("https://www.firstcry.com/");
//	}
//	public void loginbuttonclick()
//	{
//		driver.findElement(LoginButton).click();
//	}
	public void enterUserName(String EmailID) 
	{
		driver.findElement(Email_Mob_Box).sendKeys(EmailID);	
	}
	public void clickContinueButton()
	{
		driver.findElement(ContinueButton).click();
	}
	public void clickOTPBox()
	{
		driver.findElement(OTPBox).click();
	}
	public void clickSubmitButton()
	{
		driver.findElement(SubmitButton).click();
	}
 
}