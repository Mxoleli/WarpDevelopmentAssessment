package com.warpDevelopment.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.warpDevelopment.pageObjects.DetailsPage;

public class MandatoryFieldsOnly_WD_02 extends BaseClass {
	
	
	@Test
	public void SubmitMandatoryFieldsOnly_WD_02() throws InterruptedException, IOException {
		
		
		driver.get(baseURL);
		DetailsPage dp =new DetailsPage(driver);
		
		dp.getName("Man");
		dp.getSurname("Wan");
		dp.getemail("Wman@man.com");
		dp.getBirthday("19890429");
		dp.ClickSubmit();
		Thread.sleep(3000);
		
		boolean res= driver.getPageSource().contains("Form Submitted successfully");
		System.out.println("");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else {
			captureScreenshot(driver, "MandatoryFieldsOnly_WD_02");
			Assert.assertTrue(false);
		}
		
		
	}
	
	

}
