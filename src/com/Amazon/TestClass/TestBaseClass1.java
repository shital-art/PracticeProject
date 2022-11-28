package com.Amazon.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Amazon.Pomclass.AmazonLoginPomClass;

public class TestBaseClass1 {
	   WebDriver driver;
@Parameters("browserName")
	@BeforeMethod

	public void setup(String browserName) throws IOException
	{
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe\\" );
		  driver= new ChromeDriver();
	}
	else {
		System.setProperty("webdriver.gecko.driver", 
				"D:\\webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
				System.out.println("open the browser");
				driver.manage().window().maximize();//maximize the window

				driver.get("https://www.amazon.com/");
				System.out.println("open the url");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				AmazonLoginPomClass fp= new AmazonLoginPomClass(driver);
				fp.clickOnsignin();
				fp.sendemail();
				fp.clickcon();
				fp.sendpassword();

				fp.clickonlogin();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
		System.out.println("browser is close");
	}

	}

