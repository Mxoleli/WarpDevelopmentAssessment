package com.warpDevelopment.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.warpDevelopment.pageObjects.DetailsPage;

public class ValidatePageTest_WD_TC_00  extends BaseClass{
	
	@Test
	public void ValidateSite_WD_TC_00 () throws IOException {
		
		driver.get(baseURL);
		
		DetailsPage submitDetails = new DetailsPage(driver);
		
		//Verify if is a correct page
		if(driver.getTitle().equals("Warp Development")){
			
			Assert.assertTrue(true);
			
		}
		else {
			captureScreenshot(driver, "ValidateSite_WD_TC_00");
			Assert.assertTrue(false,"This page is not Warp Development");
			
		
		}
		
		//check logo
		submitDetails.validatePage();
		
		
	}
	


}
