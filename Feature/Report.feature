# Author: Sakshi Jain

@Report
Feature: This feature is used to see different reports
Scenario: List and navigate to different reports 
Given Navigate to the Home Page 
When click Report option
Then list with Job Report, MSO Debit Report, SMS Report options should display.

	@Job Report
	Scenario: Test the Job report using different filters.
	
	Given click Report
	When click Job Report
	Then page should be redirected to the Job Report Page.
	
	When select  "<From date>" and "<To date>" from Timeline And click Go button.
	Then Jobs should get listed within the selected Tomeline.
	
	Examples: 
     	| From date  | 			 To date | 	status| 
      	| 16-04-2019 | 			 16-05-2019 	|Pass|
      	|16-05-2019|			16-04-2019|	Fail|
      	
      
     When you select "<Job Status >"
     Then jobs should get listed according to the selected status.
     Examples: 
     	| Status  | 			 	|Test case status| 
     	|All|						|Pass|
      	| Initiated | 				|Pass|
      	|Inprogress|				|Pass|
     	|Failed|					|Pass|
     	|Completed|					|Pass|
     	
     	
     When you click Bulk Upload
     Then Bulk Upload pop up should display.
     
     When you enter Lco username and select activity
     Then it should display sample file download option and upload csv file options.
     
     When you click download link 
     Then it should download sample csv file
     
     When you upload the file 
     Then Upload button should be enabled
     
     When you click Upload button
     Then "Upload Success" message should display.
     
     When you click Submit button
     Then it should display "Request successfully submitted" message.
     
     When you click close button
     Then Popup should be closed.
     
     When you click Download Job Report button
     Then Job report should be downloaded in the form of csv file.
     
     
     
     
     @MSO Debit Report
     Scenario: Go to MSO Debit Report page and test different filters
     
     Given: Click MSO Debit report option.
     Then page should get redirected to the MSO Debit report page And page title should be MSO Debit Report.
     
     When select  "<From date>" and "<To date>" from Timeline And click Go button.
     Then trasactions done within the selected timeline should display only.
     
     Examples: 
     	| From Date| 			 	|To Date| 
     	|16-04-2019|				|16-05-2019|
      	     	
     
     When you select "<Debit status>" 
     Then it should display transaction details for the selected status only.
     
     Examples: 
     	|Debit Status|
     	|All         |
     	|SUCCESS     |
     	|PENDING	 |
     	|fAILED		 |
     	
     	
    When you click Download Debit Report button
    Then MSO_Debit_Report_[selected timeline].csv file should be downloaded.
    
    
      	     	
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     	
     	
     	
     	
     	
     	
	
	
