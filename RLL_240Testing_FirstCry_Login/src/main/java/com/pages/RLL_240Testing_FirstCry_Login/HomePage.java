package com.pages.RLL_240Testing_FirstCry_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	By LoginButton = By.xpath("//span[@class=\"anch poplogin_main poplogin R12_61\"]");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void LaunchFirstCry()
	{
		driver.get("https://www.firstcry.com/");
	}
	
	public void loginbuttonclick()
	{
		driver.findElement(LoginButton).click();
	}

}
