package com.mobiotics.HITS_MSO.commonPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation_menu extends BasePage {

	
	public Navigation_menu() {
		PageFactory.initElements(driver, this);
	}
	
	//-----------this is LCO Menu-------------------------
	
	@FindBy(partialLinkText="LCO List")
	public WebElement LcoList;
	
	//---------------------This is Report Menu-----------------
	
	@FindBy(partialLinkText="Job Report")
	public WebElement jobReport;
	
	@FindBy(partialLinkText="MSO Debit Report")
	public WebElement msoDebitReport;
	
	@FindBy(partialLinkText="SMS Report")
	public WebElement sms_Report;
	
}
