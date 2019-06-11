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
	
	
	//---------------This is for Product Menue---------------------
	
	@FindBy(partialLinkText="Add Products")
	public WebElement addProduct;
	
	@FindBy(partialLinkText="Add Base Plans(FTA)")
	public WebElement product_addBasePlane;
	
	@FindBy(partialLinkText="Add NXT Pay Bouquets")
	public WebElement product_AddNxtPayBouquet;
	
	@FindBy(xpath="//a[@href='msoaddbroadcasterbouquett.php']")
	public WebElement product_AddNxtAddOns;
	
	@FindBy(partialLinkText="Add A-la-carte")
	public WebElement product_AlaACarte;
	
	@FindBy(partialLinkText="Connections")
	public WebElement connections;
	
	@FindBy(partialLinkText="Disconnect")
	public WebElement connections_disconnect;
	
	@FindBy(partialLinkText="Reconnect")
	public WebElement connections_Reconnect;
}
