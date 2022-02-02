package com.crm.comcast.objectrepositorylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Greneric_utilities.WebDriverUtility;

public class ContactInfo {
	
	public ContactInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement succefullMsg;
	
	
	
	public WebElement getSuccefullMsg() 
	{
		return succefullMsg;
	}
	
	
	
	
	

	
	
	
	
	

}
