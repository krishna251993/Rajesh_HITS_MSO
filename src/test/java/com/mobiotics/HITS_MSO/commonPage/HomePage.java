package com.mobiotics.HITS_MSO.commonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HITS_MSO.LCO_LIST.LcoListPage;
import com.mobiotics.HITS_MSO.Product_AddBasePack.AddBasePackPage;
import com.mobiotics.HITS_MSO.Product_Addons.AddOnsPageTest;
import com.mobiotics.HITS_MSO.SendOSDPage.SendOsdPageTest;

import generic.Property;

public class HomePage extends Navigation_menu{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='dashboard']")
	private WebElement home;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='LCO ']")
	private WebElement lco;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Product ']")
	private WebElement product;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Renew ']")
	private WebElement renew;
	
	@FindBy(xpath="//a[@href='createcustomer']")
	private WebElement customer;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Device ']")
	private WebElement device;
	
	@FindBy(xpath="//a[@class='dropdown-toggle' and text()='Report ']")
	private WebElement Report;
	
	@FindBy(xpath="//a[@href='profile']")
	private WebElement profile;
	
	@FindBy(xpath="//a[@href='#' and text()='Logout']")
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
	
	//----------------------This is for Add Base Pack Page-------------
	
	public AddBasePackPage navigateToAddBasePack() {
		waitTillElementIsClickable(product);
		product.click();
		waitTillElementIsVisible(addProduct);
		Property.action_Move_To_Element(driver, addProduct);
		waitTillElementIsVisible(product_addBasePlane);
		product_addBasePlane.click();
		return new AddBasePackPage();
		
		
	}
	
	
	//------------------This is for Add addOns-------------------
	
 	public AddOnsPageTest navigateToAddAddOnsPage() {
		waitTillElementIsClickable(product);
		product.click();
		waitTillElementIsVisible(addProduct);
		Property.action_Move_To_Element(driver, addProduct);
		waitTillElementIsVisible(product_AddNxtPayBouquet);
		product_AddNxtPayBouquet.click();
		return new AddOnsPageTest();
	}
	
	
	
	
	
}
