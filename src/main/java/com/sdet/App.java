package com.sdet;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;

public class App 
{
	
	WebDriver driver;
public int userLogin(String in_user, String in_pwd)
{
	ResourceBundle rb = ResourceBundle.getBundle("config");
	String userName = rb.getString("username");
	String password = rb.getString("password");
	
	if(in_user.equals(userName) && in_pwd.equals(password))
		return 1;
	else
		return 0;
}
public void usertitle(String title)
{
	if (driver.getTitle().equals("OrangeHRM"))
	{
		return;
	}
}
}
