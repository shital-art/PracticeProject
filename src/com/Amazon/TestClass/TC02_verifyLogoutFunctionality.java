package com.Amazon.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.Pomclass.AmazonLoginPomClass;

public class TC02_verifyLogoutFunctionality extends TestBaseClass1 {
		@Test
	public void VerifyLogotFunctionality()
	{
			AmazonLoginPomClass fp= new AmazonLoginPomClass(driver);
			fp.clickAllmenu();
			fp.ClickonSignout();
			String expectedresult="Amazon Sign-In";

String actualresult=driver.getTitle();
System.out.println(actualresult);
Assert.assertEquals(expectedresult, actualresult);	}
	
}
