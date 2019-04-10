package com.warpDevelopment.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.warpDevelopment.pageObjects.submitCorrectDetailsPage;

public class ValidatePageTest  extends BaseClass{
	
	@Test
	public void valideThepage() {
		
		driver.get(baseURL);
		
		submitCorrectDetailsPage submitDetails = new submitCorrectDetailsPage(driver);
		
		//Verify if is a correct page
		if(driver.getTitle().equals("Warp Development")){
			
			Assert.assertTrue(true);
			
		}
		else {
			
			Assert.assertTrue(false,"This page is not Warp Development");
			
		
		}
		
		//check logo
		submitDetails.validatePage();
		
		
	}
	


}
