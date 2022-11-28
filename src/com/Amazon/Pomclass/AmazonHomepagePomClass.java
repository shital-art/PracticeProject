package com.Amazon.Pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepagePomClass {
	private WebDriver driver;
	@FindBy(xpath="(//a[@class='nav-a  '])[1]")
	WebElement Todaysdeals;
	public void clickonTodaysdeals()
	{
		Todaysdeals.click();
	}
	//(//span[@class='GridPresets-module__gridPresetsLargeItem_2xPgV2VoJCncjGPj18in1h'])[4]
	@FindBy(xpath="(//span[@class='GridPresets-module__gridPresetsLargeItem_2xPgV2VoJCncjGPj18in1h'])[4]")
	WebElement beauty;
	public void clickonbeauty()
	{
		beauty.click();
	}
	
	//(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW'])[1]
	@FindBy(xpath="(//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW'])[1]")
	WebElement lipstic;
	public void clicklipstic()
	{
		lipstic.click();
	}
	public AmazonHomepagePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
