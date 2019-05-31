#Autho: Sakshi Jain
Feature:This feature is used to see the information about the different LCOs under this MSO.
@LCO

Scenario: See the LCO information.
Given Navigate to the Home Page.
When user click on LCO option
Then LCO List option should display
When user click on LCO List option 
Then LCO List page should display
Given Navigate to the LCO List page.
Then List of different LCOs should display and also different filters should display.
When LCO List display 
Then count should get updated with the number of records displaying on the LCO List page.
When you enter LCOID in the Search BY LCO ID Text Field  click Go button.
		| 1001506184 |
Then LCO information should display of that particular LCO.
When you enter LCO user name in Search By LCO User Name Text field and click Go button
			| LCO200000955.01 |
Then LCO information should display for that LCO username.
When you enter LCO First name in Search By LCO First Name Text field and click Go button.
			| Thomos |
Then LCO information should display for that LCO First Name.
When you select any LCO and click Change Status
Then LCO status should be changed.
When you click Credit button
Then Credit to LCO Pop up should display
When you enter Amount and click Credit button
	| 100 |
Then Amount credited to the LCO successfully message should display.
When you click Close button 
When you click Edit Limit button
		| 100002| 
Then Change Transfer Limit Pop up should display
When you enter new Limit and click Change button
Then "Limit Changed Successfully" message should display.
When you click Close button 
		
		#when you click Bulk Credit 
		#Then Bulk Credit pop up should display.
		
		#When you upload a file
		#Specify location and name of the file that you are going to upload
		#Then Upload button should be enabled
		
		#When you click upload button
		#Then Upload success message should display.
		
		#When you click Submit button
		#Then "Request successfully submitted" message should display.
		
		#when you click Close button 
		#Then pop up should get closed
		
		#When you click LCO List Download button 
		#Then lcolist.csv file should be downloaded.
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		