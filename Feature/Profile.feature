#Author: Sakshi Jain

@Profile
Feature: Using this feature we can view and edit MSO details.

Scenario: Update MSO details

Given Navigate to the Home Page
When click on Profile
Then page should be redireceted to the MSO Details page. In this page MSO Id, MSO Name, 
MSO Surname, Email, Mobile number, status, registration date, cuntry id, city, Area, Postal code, username, 
Change Password link and Update button should display. Among all these only Mobile Number and email id text 
field should display in edit mode.

When you change "<Email Id>" click Update button
Then "Email Updated Successfully" message should display.

Examples: 
     	| Email Id  | 				status|
     	|akshata.KV@mobiotics.com|	Pass  |

When you Change "<Mobile NUmber>" And click Update button
Then OTP should be sent to the entered mobile number.
Examples: 
     	| Mobile Number  | 				status|
     	|8947988775|					Pass  |

When we click Resend OTP
Then it should resend the OTP

When you enter OTP and click Verify 
Then it should update the mobile number.

When we click Change Password link
Then Change Password window should display

When we enter "<New Password>" in New Password and Confirm New Password Text field and click Proceed button
Then "Password Changed" message should display.
Examples: 
     	| New Password  | 				status|
     	|Test@123|						Pass  |







