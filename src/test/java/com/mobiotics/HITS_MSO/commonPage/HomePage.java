package com.mobiotics.HITS_MSO.commonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HITS_MSO.LCO_LIST.LcoListPage;

public class HomePage extends Navigation_menu{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='dashboard']")
	private WebElement home;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='LCO ']")
	private WebElement lco;
	
	@FindBy(xpath="//a[@href='osd']")
	private WebElement sendOSD;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Report ']")
	private WebElement Report;
	
	@FindBy(xpath="//a[@href='profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[@href='#']")
	private WebElement logout;
	
	
	
	//-----------------This is homePage-------------------
	
	public LcoListPage navigateToHomePage() {
		home.click();
		return new LcoListPage();
		
	}

	//-----------------This is for LcoList--------------------
	
	public LcoListPage navigateToLcoListPage() {
		lco.click();
		waitTillElementIsVisible(LcoList);
		LcoList.click();
		return new LcoListPage();
	}
	
	
}
