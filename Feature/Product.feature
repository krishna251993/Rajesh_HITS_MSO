#Author: Rajesh Thakur

@product
Feature: This feature is used to test product Module
  I want to use this template for my feature file

  @AddProduct, @AddBasePack
  Scenario: This Scenario is used to add the single Base Pack to the customer
    Given Navigate to the Add BasePage.
    When click on the product mouse over the Add product click on the Add Base plane 
    Then Add Base Pack Page should be display
    When user select the given LCO username from the Drop Down 
    		| LCO200000955.01 |
    And enter the customerID and click on GO Button
    		| 1039707965 |
    Then All the Base planes and and customer name should be display in the portal
    And click any random radio button and click on confirm select
    Then calculate the price properly and click on subscribe button
    
    
    @AddProduct, @AddonsPack
    Scenario: this Scenario is used to add single AddOns
    	Given Navigate to the Add AddOns.
    	When click on the product mouse over the Add product click on the Add Nxt Pay Bouquet
    	Then Add Addons Pack Page should be display
   		When user select the given LCO username from the Drop Down for add AddOns
    		| LCO200000955.01 |
      And enter the customerID and click on GO Button for AddAddOns
    		| 1039707965 |
    	Then All the Addons planes and and customer name should be display in the portal for AddAddOns
    	And click any random radio button and click on confirm select to AddOns
      Then calculate the price properly and click on subscribe button to subscribe That perticular  channel
    	
    
    
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
    #  | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
