package com.mobiotics.HITS_MSO.SendOSDPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HITS_MSO.commonPage.BasePage;

public class SendOsdPageTest extends BasePage{
	
	public SendOsdPageTest() {
		PageFactory.initElements(driver, this);
	}
	
	static final Logger logger=Logger.getLogger(SendOsdPageTest.class);

	@FindBy(xpath="//input[@type='file']")
	private WebElement fileUpload;
	
	@FindBy(id="osdupload")
	private WebElement uploadBtn;
	
	@FindBy(id="osd-upload-status")
	private WebElement uploadStatus;
	
	@FindBy(id="initiateOsdButton")
	private WebElement sendOSDBtn;
	
	
}
