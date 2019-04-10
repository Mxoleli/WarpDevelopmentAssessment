package com.warpDevelopment.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class submitCorrectDetailsPage {
	
	WebDriver ldriver;		
	
	public submitCorrectDetailsPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);			//constructor 
	}
	
	@FindBy(how=How.LINK_TEXT, using ="Warp Development")
	@CacheLookup
	WebElement logo;
	@FindBy(how=How.ID, using ="Name")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(how=How.ID, using ="Surname")
	@CacheLookup
	WebElement txtSurname;
	
	@FindBy(how=How.ID, using ="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.ID, using ="Country")
	@CacheLookup
	WebElement dropDownCountry;
	
	@FindBy(how=How.XPATH, using ="//input[@value='Green']")
	@CacheLookup
	WebElement radioColour;
	
	@FindBy(how=How.ID, using ="Birthday")
	@CacheLookup
	WebElement txtBirthday;
	
	@FindBy(how=How.ID, using ="CellphoneNumber")
	@CacheLookup
	WebElement txtCellphoneNumber;
	
	@FindBy(how=How.ID, using ="Comments")
	@CacheLookup
	WebElement txtComments;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[2]/form/div/div[9]/div/button")
	@CacheLookup
	WebElement SubmitBtn;
	
	public void validatePage() {
		
		logo.isDisplayed();
		Assert.assertTrue((logo.getText().equalsIgnoreCase("Warp Development")),"Logo is icorrect");
	}
	

	public void getName(String name) {
		
		txtName.sendKeys(name);
	}
	
	public void getSurname(String sname) {
		
		txtSurname.sendKeys(sname);
	}
	
	public void getemail(String email) {
		
		txtEmail.sendKeys(email);
	}
	
	public void getCountry(String country) {
		
		Select countryy = new Select(dropDownCountry);
		countryy.selectByVisibleText(country);
		//countryy.selectByValue("RSA");
		
	}
	
	public void getColour() {
		
		radioColour.click();
		
	}
	
	public void getBirthday(String bDay) {
		
		
		txtBirthday.sendKeys(bDay);
		
	}
	
	
	public void getCellNumber(String cnum) {
		
		
		txtCellphoneNumber.sendKeys(cnum);
		
	}
	
	public void getComments(String cmm) {
		
		txtComments.sendKeys(cmm);
	}
	
	public void ClickSubmit() {
		
		SubmitBtn.click();
	}
	



}
