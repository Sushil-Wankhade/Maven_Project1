package com.sdet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_Login 
{
	@SuppressWarnings("deprecation")
	@Test
	public void login_Test() throws InterruptedException 
	{
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	Thread.sleep(500);
	driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
	
	Thread.sleep(1000);
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	
	Thread.sleep(1000);
	driver.close();
	}
	}
