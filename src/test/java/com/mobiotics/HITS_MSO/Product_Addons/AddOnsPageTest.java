package com.mobiotics.HITS_MSO.Product_Addons;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HITS_MSO.commonPage.BasePage;

public class AddOnsPageTest extends BasePage{
	public AddOnsPageTest() {
		PageFactory.initElements(driver, this);
	}
	
	static final Logger logger=Logger.getLogger(AddOnsPageTest.class);
	
	@FindBy(xpath="//h1[@class='pull-leftinput']")
	private WebElement AddOnsPageTitle;
	
	@FindBy(id="customerName")
	private WebElement customerName;
	
	
	@FindBy(xpath="//*[@id='lconame']")
	private WebElement slectDropDown;
	
	@FindBy(name="customerid")
	private WebElement enterCustId;
	
	@FindBy(id="customerid")
	private WebElement goBtn;
	
	public int getTotalNoOfBasePlane() {
		//waitTillElementIsVisible(checkBoxes);
		return checkBoxes.size();
	}
	
	public String getAddOnsPageTitle() {
		waitTillElementIsVisible(AddOnsPageTitle);
		return getAnyText(AddOnsPageTitle);
	}
	
	public String getCustomerName() {
		return getAnyText(customerName);
	}
	
	
	public void selectLcoUserName(String text) {
		//waitTillElementIsVisible(slectLcoDropDown);
		//selectElementByVisibleText(slectLcoDropDown, text);
		slectDropDown.click();
		Select select=new Select(slectDropDown);
		select.selectByVisibleText(text);
	}
	
	public void enterCustomerId(String customerID) {
		waitTillElementIsVisible(enterCustId);
		enterCustId.sendKeys(customerID);
		
	}
	
	public void clickGoBtn() {
		waitTillElementIsClickable(goBtn);
		goBtn.click();
	}
	

}
