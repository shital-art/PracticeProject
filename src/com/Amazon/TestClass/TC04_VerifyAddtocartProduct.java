package com.Amazon.TestClass;

import org.testng.annotations.Test;

import com.Amazon.Pomclass.AmazonHomepagePomClass;

public class TC04_VerifyAddtocartProduct extends TestBaseClass1 {
	@Test
	public void verifyAddtocart()
	{
		AmazonHomepagePomClass Ac=new AmazonHomepagePomClass(driver);
		Ac.clickonTodaysdeals();
		Ac.clickonbeauty();
		Ac.clicklipstic();
		
		
		
	}

}
