package com.Amazon.Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPomClass {
	WebDriver driver;
	Actions act;
	//click on sign in
	@FindBy(xpath="//span[contains(text(),'Account & Lists')]")
	WebElement signin;
	public void clickOnsignin()
	{
		signin.click();
	}
	//send email
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement email;
	public void sendemail()
	{
email.sendKeys("+919172384730");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue1;
	public void clickcon()
	{
		continue1.click();
	}
	
	//send password
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	public void sendpassword()
	{
		password.sendKeys("mahesh@11");
	}
	//click login
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement login;
	public void clickonlogin()
	{
		login.click();
	}
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement AllMenu;
	public void clickAllmenu()
	{
		AllMenu.click();
	}
	
	@FindBy(xpath="//a[text()='Sign Out']")
	WebElement signout;
	public void ClickonSignout()
	{
		signout.click();
	}
	
	//a[text()='Sign Out']

	@FindBy(xpath="//span[@class='nav-line-2']")
	WebElement Languageselect;
	public void MouseHover()
	{
		act.moveToElement(Languageselect).perform();
	}
	
	@FindBy(xpath="(//i[@class='icp-radio'])[1]")
	WebElement eng;
	public void engclick()
	{
		eng.click();
	}
	
	public String getText1()
	{
		 String act=eng.getText();
		 return act;		 
	}
	public AmazonLoginPomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		 act=new Actions(driver);
		
	}
	

}
