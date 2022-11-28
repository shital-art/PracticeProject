package com.Amazon.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.Pomclass.AmazonLoginPomClass;

public class TC03_VerifyLanguageSelectorNot  extends TestBaseClass1{
@Test	
public void VerifyLanguageSelect()
{
	AmazonLoginPomClass fp=new AmazonLoginPomClass(driver);
	fp.MouseHover();
	fp.engclick();
	String ActualLang=fp.getText1();
	String Expectedlang="English -";
	Assert.assertEquals(ActualLang, Expectedlang);
}
}
