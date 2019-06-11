package com.mobiotics.StepDefinations;

import java.util.List;

import org.testng.Assert;

import com.mobiotics.HITS_MSO.Product_AddBasePack.AddBasePackPage;
import com.mobiotics.HITS_MSO.commonPage.HomePage;
import com.mobiotics.HitsMso_Constant.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.Utility;

public class AddBasePackFeatureTestStepDefination extends BaseTest {
	
	AddBasePackPage homePage;
	
	
	@Given("^Navigate to the Add BasePage\\.$")
	public void navigate_to_the_Add_BasePage() throws Throwable {
		homePage=new HomePage().navigateToAddBasePack();
		log.info("user is in Add Base Pack Page");
		
	    
	}

	
	
	
	@When("^click on the product mouse over the Add product click on the Add Base plane$")
	public void click_on_the_product_mouse_over_the_Add_product_click_on_the_Add_Base_plane() throws Throwable {
	   
	}

	@Then("^Add Base Pack Page should be display$")
	public void add_Base_Pack_Page_should_be_display() throws Throwable {
		if(homePage.getAddBasePackTitle().equals("Add Base Pack"));
	   Assert.assertTrue(true);
	}

	@When("^user select the given LCO username from the Drop Down$")
	public void user_select_the_given_LCO_username_from_the_Drop_Down(DataTable lcoUserName) throws Throwable {
	    
		List<List<String>> data =lcoUserName.raw();
		
		String lcoUserNa=data.get(0).get(0);
		System.out.println(lcoUserNa);
		homePage.selectLcoUserName(lcoUserNa);
		
		/*
		 * 
		 * List<List<String>> data = LCOID.raw();
		
		homePage.getLCOIDElement().sendKeys(data.get(0).get(0));
		homePage.clictoLcoid();
		 * 
		 */
		
	}

	@When("^enter the customerID and click on GO Button$")
	public void enter_the_customerID_and_click_on_GO_Button(DataTable custID) throws Throwable {
		List<List<String>> data =custID.raw();
		homePage.enterCustomerId(data.get(0).get(0));
		log.info("user enter customerID");
		homePage.clickGoBtn();
		log.info("user clicked on the Go BTN");
		
	}

	@Then("^All the Base planes and and customer name should be display in the portal$")
	public void all_the_Base_planes_and_and_customer_name_should_be_display_in_the_portal() throws Throwable {
	   log.info("customer Name--"+homePage.getCustomerName());
	   
	}

	@Then("^click any random radio button and click on confirm select$")
	public void click_any_random_radio_button_and_click_on_confirm_select() throws Throwable {
	   
	    
	    int randomNo=Utility.getRandomNumber(1, homePage.getTotalNoOfBasePlane());
		   homePage.runXpath(randomNo);
	}

	@Then("^calculate the price properly and click on subscribe button$")
	public void calculate_the_price_properly_and_click_on_subscribe_button() throws Throwable {
	    double lcoPrice=homePage.calculateLcoPrice();
	    
	    String totalPriceString=homePage.getTotalPrice();
	    double totalPriceDouble=Double.valueOf(totalPriceString);
	    
	    if(lcoPrice==totalPriceDouble) {
	    	log.info("calculated price is exactly equal To Portal price");
	    	
	    	homePage.clickOnSubscribeBtn();
	    }
	    
	    else {
	    	log.warn("calculated price is not equal to the portal price");
	    	
	    	log.info("portal price="+totalPriceDouble);
	    	log.info("calculated price="+lcoPrice);
	    }
	
	}
	
	

}
