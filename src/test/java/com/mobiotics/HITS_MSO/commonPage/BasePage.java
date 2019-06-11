package com.mobiotics.HITS_MSO.commonPage;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.mobiotics.HitsMso_Constant.AutomationConstants;
import com.mobiotics.HitsMso_Constant.BaseTest;

import generic.Property;

public class BasePage {
	
	public Logger log=Logger.getLogger(this.getClass());
	public WebDriver driver;
	public String configFile;
	public long timeout;

	public BasePage() {
		this.driver=BaseTest.driver;
		configFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
		timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
		
	}
	
	public  void waitTillElementIsVisible(WebElement element)
	{
		
		 new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void verifyURLis(String expectedUrl)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.urlToBe(expectedUrl));
		
	}
	
	public boolean verifyURLhas(String expectedURL) {
		 return new WebDriverWait(driver, timeout).until(ExpectedConditions.urlContains(expectedURL));
		 
	 }
	
	public void moveToElement(WebElement element) {
		 Actions actions=new Actions(driver);
		 actions.moveToElement(element).perform();
	 }
	
	 public boolean isElementdisPlayed(WebElement element) {
		 try {
			element.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("element is not displayed Exception "+e.getMessage());
			return false;
		}
	 }
	 
	 public void waitTillElementIsClickable(WebElement element)
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		}
	 
	 
	 public String getAnyText(WebElement element) {
		 return element.getText();
	 }
	 
	 public int countCheckBoxe(List<WebElement> checkBoxes) {
		// waitTillElementIsVisible(checkBoxes);
		 
		 return checkBoxes.size();
	 }
	 
	 
	 public boolean IsTestElementPresent(WebElement element)
	  {
	      try
	      {
	          //driver.findElement(By.xpath(element)).isDisplayed();
	          
	    	  element.isDisplayed();
	    	  return true;
	      }
	      catch (Exception e)
	      {
	    	  System.out.println("exception  =  "+e);
	          return false;
	      }
	  }
	 
	
	 
	  
	
	
	
}
