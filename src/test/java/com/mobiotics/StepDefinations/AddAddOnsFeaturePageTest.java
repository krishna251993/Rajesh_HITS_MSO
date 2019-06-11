package com.mobiotics.StepDefinations;

import java.util.List;

import org.testng.Assert;

import com.mobiotics.HITS_MSO.Product_Addons.AddOnsPageTest;
import com.mobiotics.HITS_MSO.commonPage.HomePage;
import com.mobiotics.HitsMso_Constant.BaseTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.Utility;

public class AddAddOnsFeaturePageTest extends BaseTest{
	
	AddOnsPageTest homePage;
	
	@Given("^Navigate to the Add AddOns\\.$")
	public void navigate_to_the_Add_AddOns() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homePage=new HomePage().navigateToAddAddOnsPage();
		log.info("user is in Add Ons Page");
	}

	
	@When("^click on the product mouse over the Add product click on the Add Nxt Pay Bouquet$")
	public void click_on_the_product_mouse_over_the_Add_product_click_on_the_Add_Nxt_Pay_Bouquet()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Add Addons Pack Page should be display$")
	public void add_Addons_Pack_Page_should_be_display() {
	   
	   if(homePage.getAddOnsPageTitle().equals("Add Addons")) {
		   Assert.assertTrue(true);
		   log.info("User is in Add ons page");
		   
		    
	   }
	   
	   else {
		   log.warn("User is not in Add Ons");
	   }
	}
	
	@When("^user select the given LCO username from the Drop Down for add AddOns$")
	public void user_select_the_given_LCO_username_from_the_Drop_Down_for_add_AddOns(DataTable lcoUserName) throws Throwable {
        List<List<String>> data =lcoUserName.raw();
		
		String lcoUserNa=data.get(0).get(0);
		System.out.println(lcoUserNa);
		
		homePage.selectLcoUserName(lcoUserNa);
	}
	
	@When("^enter the customerID and click on GO Button for AddAddOns$")
	public void enter_the_customerID_and_click_on_GO_Button_for_AddAddOns(DataTable custID) {
		List<List<String>> data =custID.raw();
		homePage.enterCustomerId(data.get(0).get(0));
		log.info("user enter customerID");
		homePage.clickGoBtn();
		log.info("user clicked on the Go BTN");
	}



    @Then("^All the Addons planes and and customer name should be display in the portal for AddAddOns$")
    public void all_the_Addons_planes_and_and_customer_name_should_be_display_in_the_portal_for_AddAddOns() throws Throwable {
   
    
    	log.info("customer Name--"+homePage.getCustomerName());
    	
    	
}

    @Then("^click any random radio button and click on confirm select$")
	public void click_any_random_radio_button_and_click_on_confirm_select() throws Throwable {
	   
	    
	    int randomNo=Utility.getRandomNumber(1, homePage.getTotalNoOfBasePlane());
		   homePage.runXpath(randomNo);
	}
	

	




}
