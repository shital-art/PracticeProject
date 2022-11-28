package com.Amazon.TestClass;



import java.time.Duration;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Amazon.Pomclass.AmazonLoginPomClass;



public class TC01Verifyloginfunctionality extends TestBaseClass1 {
		@Test
	public void VerifyLoginFunctionality()
	{
			String expectedresult="Amazon.com. Spend less. Smile more.";

String actualresult=driver.getTitle();
System.out.println(actualresult);
Assert.assertEquals(expectedresult, actualresult);

	}
		}


