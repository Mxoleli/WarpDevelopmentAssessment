package com.warpDevelopment.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.warpDevelopment.pageObjects.submitCorrectDetailsPage;

public class SubmitCorrectDetails_WD_TC_01 extends BaseClass {
	
	@Test
	public void SubmitCorrectDetails() throws InterruptedException {
		
		driver.get(baseURL);
		
		submitCorrectDetailsPage submitDetails = new submitCorrectDetailsPage(driver);

		
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
			
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	

}
