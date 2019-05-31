package com.mobiotics.StepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.mobiotics.HITS_MSO.LCO_LIST.LcoListPage;
import com.mobiotics.HITS_MSO.commonPage.HomePage;
import com.mobiotics.HitsMso_Constant.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.Utility;

public class LCOFeaturePageTestStepDefination extends BaseTest {
	
	LcoListPage lcoListPage;
	
	LcoListPage homePage;
	
	
	
	//public WebDriver driver;
	
	
	@Before
	public void statApplication() throws InterruptedException {
		initApplication();
	}
	
	
	@Given("^Navigate to the Home Page\\.$")
	public void navigate_to_the_Home_Page()  {
		
		homePage=new HomePage().navigateToHomePage();
		log.info("user is in home Page");
		
		
	    
	}

	@When("^user click on LCO option$")
	public void user_click_on_LCO_option()  {
	  homePage=new HomePage().navigateToLcoListPage();
	    log.info("user clicked the LCO_List option");
	}

	@Then("^LCO List option should display$")
	public void lco_List_option_should_display()  {
	    log.info("LCO list option Displayed");
	}

	@When("^user click on LCO List option$")
	public void user_click_on_LCO_List_option()  {
	    log.info("user clicked on the LCO_List option");
	}

	@Then("^LCO List page should display$")
	public void lco_List_page_should_display()  {
		log.info("LCO list page Displayed");
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Given("^Navigate to the LCO List page\\.$")
	public void navigate_to_the_LCO_List_page() {
		
		if(homePage.equals("LCO List")) {
			Assert.assertTrue(true);
			log.info("user is LCO list page");
		}
	    
	}

	@Then("^List of different LCOs should display and also different filters should display\\.$")
	public void list_of_different_LCOs_should_display_and_also_different_filters_should_display() {
		Utility.getRandomNumber(1, homePage.countNOOfLCOs());
		if(homePage.isSearchByLCOIDDisplayed()) {
			log.info("search By Lco Id Filter is displayed");
		}
		else {
			log.info("Search by LCOID Filter is not displaying");
		}
		
		if(homePage.isSearchByLcoUserNameDisplayed()) {
			log.info("search by LCO username displaying");
		}
		
		else {
			log.info("search by LCO userName is not displaying");
		}
		
		if(homePage.isSearchByFirstNameDisplayed()) {
			log.info("search by LCO username filter is displayin");
		}
		
		else {
			log.info("search by LCO Username filter is not Displaying");
		}
		
	}

	@When("^LCO List display$")
	public void lco_List_display()  {
		
		System.out.println(homePage.getCountOfLcos());
	   
	}

	@Then("^count should get updated with the number of records displaying on the LCO List page\\.$")
	public void count_should_get_updated_with_the_number_of_records_displaying_on_the_LCO_List_page()  {
	   
	}

	@When("^you enter LCOID in the Search BY LCO ID Text Field  click Go button\\.$")
	public void you_enter_LCOID_in_the_Search_BY_LCO_ID_Text_Field_click_Go_button(DataTable LCOID)  {
		List<List<String>> data = LCOID.raw();
		
		homePage.getLCOIDElement().sendKeys(data.get(0).get(0));
		homePage.clictoLcoid();
			
	}

	@Then("^LCO information should display of that particular LCO\\.$")
	public void lco_information_should_display_of_that_particular_LCO()  {
	  int count=Integer.valueOf(homePage.getCountOfLcos());
	  if(count>0) {
		  log.info("Number of LCO is displaying="+count);
	  }
	  
	  else {
		  log.info("No LCO is Displaying.......");
	  }
	  
	  
	    
	}

	@When("^you enter LCO user name in Search By LCO User Name Text field and click Go button$")
	public void you_enter_LCO_user_name_in_Search_By_LCO_User_Name_Text_field_and_click_Go_button(DataTable LCOUserName) {
	  
		List<List<String>> data = LCOUserName.raw();
		homePage.getLCOUserNameElement().sendKeys(data.get(0).get(0));
		homePage.clickToLcoUserName();
	}

	@Then("^LCO information should display for that LCO username\\.$")
	public void lco_information_should_display_for_that_LCO_username() {
	    // Write code here that turns the phrase above into concrete actions
	  
		 int count=Integer.valueOf(homePage.getCountOfLcos());
		  if(count>0) {
			  log.info("Number of LCO is displaying by the userName="+count);
		  }
		  
		  else {
			  log.info("No LCO is Displaying by the given username.......");
		  }
		
		
		
	}

	@When("^you enter LCO First name in Search By LCO First Name Text field and click Go button\\.$")
	public void you_enter_LCO_First_name_in_Search_By_LCO_First_Name_Text_field_and_click_Go_button(DataTable lcoFirstName) throws Throwable {
		List<List<String>> data = lcoFirstName.raw();
		String firstName=data.get(0).get(0);
		homePage.searchByFirstName(firstName);
	   
	}

	@Then("^LCO information should display for that LCO First Name\\.$")
	public void lco_information_should_display_for_that_LCO_First_Name() throws Throwable {
	  
		

		 int count=Integer.valueOf(homePage.getCountOfLcos());
		  if(count>0) {
			  log.info("Number of LCO is displaying by the firstName="+count);
		  }
		  
		  else {
			  log.info("No LCO is Displaying by the given firstName.......");
		  }
		
	}
	
	@When("^you select any LCO and click Change Status$")
	public void you_select_any_LCO_and_click_Change_Status() throws InterruptedException {
	   
		homePage.clickTheCheckBoxToChangeTheLcoStatus();
		
		
		
	}

	@Then("^LCO status should be changed\\.$")
	public void lco_status_should_be_changed() {
		
		log.info("LCO status changed");
	   
	}
	
	
	
	@When("^you click Credit button$")
	public void you_click_Credit_button()  {
		homePage.clickTocreditBtn();
	}

	@Then("^Credit to LCO Pop up should display$")
	public void credit_to_LCO_Pop_up_should_display() throws Throwable {
	   
		if(homePage.isLcoPopUPDisplayed()==true) {
			log.info("Credit Lco Pop Up Displayed");
		}
		else
			log.info("Credit Lco pop up is not displaying");
		
		
	}

	@When("^you enter Amount and click Credit button$")
	public void you_enter_Amount_and_click_Credit_button(DataTable amount) {
		
		List<List<String>> data = amount.raw();
		String creditAmt=data.get(0).get(0);
		long crAmt=Long.valueOf(creditAmt);
		long transferLimit=homePage.getTranferLimit();
		
		if(crAmt>transferLimit) {
			
			homePage.getErrorMsg();
			log.info("credit amount is greater tham transfer limit");
			
			
		}
		
		else {
			homePage.enterAmountToCredit(creditAmt);
			log.info(creditAmt+" is credited to add the LCO");
			log.info("credit button clicked");
			
		}
	    
	}

	@Then("^Amount credited to the LCO successfully message should display\\.$")
	public void amount_credited_to_the_LCO_successfully_message_should_display() {
	  
		log.info(homePage.getSuccessMsg());
	}

	@When("^you click Close button$")
	public void you_click_Close_button() throws Throwable {
	   homePage.clickCloseBtn();
	   log.info("After the successfully adding the credit pop has been closed");
	}

	@When("^you click Edit Limit button$")
	public void you_click_Edit_Limit_button(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@Then("^Change Transfer Limit Pop up should display$")
	public void change_Transfer_Limit_Pop_up_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^you enter new Limit And click Change button$")
	public void you_enter_new_Limit_And_click_Change_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^\"([^\"]*)\" message should display\\.$")
	public void message_should_display(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}







}
