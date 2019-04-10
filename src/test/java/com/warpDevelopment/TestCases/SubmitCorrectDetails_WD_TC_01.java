package com.warpDevelopment.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.warpDevelopment.pageObjects.DetailsPage;

public class SubmitCorrectDetails_WD_TC_01 extends BaseClass {
	
	@Test
	public void SubmitCorrectDetails__WD_TC_01() throws InterruptedException, IOException {
		
		driver.get(baseURL);
		
		DetailsPage submitDetails = new DetailsPage(driver);

		
		//Fill in the Contact US form
		submitDetails.getName("Man");
		submitDetails.getSurname("Wan");
		submitDetails.getemail("mWan@man.com");
		submitDetails.getCountry("South Africa");
		submitDetails.getColour();
		submitDetails.getBirthday("29041989");
		submitDetails.getCellNumber("0854251141");
		submitDetails.getComments("Please get back to me");
		submitDetails.ClickSubmit();
		Thread.sleep(3000);
		
		boolean res= driver.getPageSource().contains("Form Submitted successfully");
		System.out.println("");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else {
			captureScreenshot(driver, "SubmitCorrectDetails__WD_TC_01");
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	

}
