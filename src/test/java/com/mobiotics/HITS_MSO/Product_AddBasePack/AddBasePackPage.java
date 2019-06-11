package com.mobiotics.HITS_MSO.Product_AddBasePack;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.HITS_MSO.commonPage.BasePage;

public class AddBasePackPage extends BasePage{
	
	public AddBasePackPage() {
		PageFactory.initElements(driver, this);
	}
	
	static final Logger logger=Logger.getLogger(AddBasePackPage.class);
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/div/h1")
	private WebElement addBasePackTitle;
	
	@FindBy(xpath="//*[@id='lconame']")
	private WebElement slectDropDown;
	
	@FindBy(name="customerid")
	private WebElement enterCustId;
	
	@FindBy(id="customerid")
	private WebElement goBtn;
	
	@FindBy(id="customerName")
	private WebElement customerName;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkBoxes;
	
	@FindBy(id="confirm-subscribe")
	private WebElement confirmSelect;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[1]")
	private WebElement productName;
	
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[2]")
	private WebElement LCOPrice;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[3]")
	private WebElement NCFPrice;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[4]")
	private WebElement Tax;

	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[5]")
	private WebElement TotalPrice;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/table/tbody/tr/td[6]")
	private WebElement ExpiryDate;
	
	@FindBy(id="confirmcart")
	private WebElement SubscribeBtn;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/table/tbody/tr/td[1]")
	private WebElement productId;
	
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/table/tbody/tr/td[2]")
	private WebElement productNameAfterActivation;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/table/tbody/tr/td[3]")
	private WebElement status;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/table/tbody/tr/td[4]")
	private WebElement errorMsg;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div[4]/div/table/tbody/tr/td[5]")
	private WebElement errorCode;
	
	private String xp1="(//input[@type='checkbox'])[";
	
	private String xp2="]";
	
	public String getAddBasePackTitle() {
		waitTillElementIsVisible(addBasePackTitle);
		return getAnyText(addBasePackTitle);
		
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
	
	public int getTotalNoOfBasePlane() {
		//waitTillElementIsVisible(checkBoxes);
		return checkBoxes.size();
	}
	
	public String getCustomerName() {
		return getAnyText(customerName);
	}
	
	public void runXpath(int num) {
		driver.findElement(By.xpath(xp1+num+xp2)).click();
		
	}
	
	public double calculateLcoPrice() {
		
		waitTillElementIsClickable(confirmSelect);
		confirmSelect.click();
		waitTillElementIsVisible(LCOPrice);
		
		
		double lcoPriceDouble=Double.valueOf(LCOPrice.getText());		
	
		logger.info("lco price--"+lcoPriceDouble);
		
		waitTillElementIsVisible(NCFPrice);
		double NCFPricedouble=Double.valueOf(NCFPrice.getText());
	
		logger.info("NCF price---"+NCFPricedouble);
		waitTillElementIsVisible(Tax);
		double Taxdouble=Double.valueOf(Tax.getText());
		logger.info("Tax---"+Taxdouble);
		
		double totalPriceDouble=lcoPriceDouble+NCFPricedouble+Taxdouble;
		//logger.info("Total calculated price--"+);
		
		return totalPriceDouble;
	
	}
	
	public String getTotalPrice() {
		return getAnyText(TotalPrice);
	}
	
	public void clickOnSubscribeBtn() {
		waitTillElementIsClickable(SubscribeBtn);
		SubscribeBtn.click();
	}
	
	
	
}
