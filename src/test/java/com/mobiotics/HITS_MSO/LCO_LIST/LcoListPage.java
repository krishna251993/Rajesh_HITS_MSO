package com.mobiotics.HITS_MSO.LCO_LIST;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.HITS_MSO.commonPage.BasePage;

import generic.Utility;

public class LcoListPage extends BasePage {
	
	public LcoListPage() {
		PageFactory.initElements(driver, this);
	}
	
	static final Logger logger=Logger.getLogger(LcoListPage.class);
	
	@FindBy(xpath="//label[@style='line-height:70px;margin:0px;font-size:25px']")
	private WebElement homePageTitle;
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[1]/h1")
	private WebElement LCO_ListTitle;
	
	@FindBy(xpath="//input[@type='text'  and @name='lcoid' ]")
	private WebElement searcByLcoId;
	@FindBy(id="lcoid")
	private WebElement clickToLcoiD;
	
	
	@FindBy(name="username")
	private WebElement LcoUserName;
	
	@FindBy(id="username")
	private WebElement clickToUserName;
	
	
	
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(xpath="//div[@class='thumbnail']")
	private WebElement count;
	
	@FindBy(id="totalcount")
	private WebElement count_No;
	
	@FindBy(id="lcolistdownload")
	private WebElement Lco_List_Download;
	
	@FindBy(id="bulk-credit")
	private WebElement bulk_Credit;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkBoxes;
	
	@FindBy(id="firstname")
	private WebElement clickTofirstName;
	
	@FindBy(id="change-status")
	private  WebElement changeStatus;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-danger creditlcobutton' ]")
	private WebElement creditBtn;
	
	@FindBy(id="myModalLabel")
	private WebElement creditLCOPopUp;
	
	@FindBy(xpath="//*[@id='credit-form']/div[2]/div/p/span[2]")
	private WebElement transferLimit;
	
	@FindBy(xpath="//*[@id='creditlcomodal']/div/div/div[2]/p[1]")
	private WebElement errorMsg;
	
	@FindBy(id="creditadd")
	private WebElement addAmount;
	
	@FindBy(id="close")
	private WebElement close;
	
	@FindBy(xpath="//*[@id='creditlcomodal']/div/div/div[2]/p[2]")
	private WebElement successMsg;
	
	
	
	public int  countNOOfLCOs() {
		return checkBoxes.size();
		
	}
	
	private String xp1="(//input[@type='checkbox'])[";
	
	private String xp2="]";
	
	
	
	public void runXpath(int num) {
		driver.findElement(By.xpath(xp1+num+xp2)).click();
		
	}
	
	
	public String getLCO_ListTitle() {
		
		waitTillElementIsVisible(LCO_ListTitle);
		return LCO_ListTitle.getText();
	}
	
	public boolean isSearchByLCOIDDisplayed() {
		waitTillElementIsVisible(searcByLcoId);
		return isElementdisPlayed(searcByLcoId);
	}
	
	public boolean isSearchByLcoUserNameDisplayed() {
		
		return isElementdisPlayed(LcoUserName);
	}
	
	public boolean isSearchByFirstNameDisplayed() {
		waitTillElementIsVisible(firstName);
		return isElementdisPlayed(firstName);
	}
	
	public String getCountOfLcos() {
		return getAnyText(count_No);
	}
	
	public WebElement getLCOIDElement() {
		waitTillElementIsVisible(searcByLcoId);
		return searcByLcoId;
	}
	
	public WebElement getLCOUserNameElement() {
		return LcoUserName;
	}
	
	public void clickToLcoUserName() {
		waitTillElementIsClickable(clickToUserName);
		clickToUserName.click();
	}
	
	public void clictoLcoid() {
		waitTillElementIsVisible(clickToLcoiD);
		clickToLcoiD.click();
	}
	
	
	public void searchByFirstName(String firstname) {
		firstName.sendKeys(firstname);
		waitTillElementIsVisible(clickTofirstName);
		clickTofirstName.click();
	}
	
	//this is for change the status 
	public void clickTheCheckBoxToChangeTheLcoStatus() throws InterruptedException {
		int noOfCheckBoxes=countCheckBoxe(checkBoxes);
		System.out.println(noOfCheckBoxes);
		int randomCheckBoxes=Utility.getRandomNumber(1, noOfCheckBoxes);
		System.out.println(randomCheckBoxes);
		
		Thread.sleep(2000);
		
		runXpath(randomCheckBoxes);
		waitTillElementIsClickable(changeStatus);
		
		//changeStatus.click();
		
	}
	
	
	public void clickTocreditBtn() {
		waitTillElementIsClickable(creditBtn);
		creditBtn.click();
	}
	
	
	public boolean isLcoPopUPDisplayed() {
		waitTillElementIsVisible(creditLCOPopUp);
		return IsTestElementPresent(creditLCOPopUp);
		
	}
	
	public long getTranferLimit() {
		waitTillElementIsVisible(transferLimit);
		
		return Long.valueOf(transferLimit.getText());
	}
	
	public String getErrorMsg() {
		String test="NO error came";
		if(IsTestElementPresent(errorMsg)) {
			return getAnyText(errorMsg);
		}
		
		else {
			return test;
		}
		
	}
	
	public void enterAmountToCredit(String amount) {
		waitTillElementIsVisible(addAmount);
		addAmount.sendKeys(amount);
		waitTillElementIsClickable(creditBtn);
		creditBtn.click();
		
	}
	
	public String getSuccessMsg() {
		String test="Fatel error";
		waitTillElementIsVisible(successMsg);
		if(IsTestElementPresent(successMsg)) {
			return successMsg.getText();
		}
		
		else
			return test;
		}
	
	public void clickCloseBtn() {
		waitTillElementIsClickable(close);
		close.click();
	}
	
	
	
	
	

}
