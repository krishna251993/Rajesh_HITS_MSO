#Author: Sakshi Jain

@SendOSD
Feature: This feature is used to send OSD messages.
Scenario: Send OSD Message.

Given Navigate to Home Page.

When click Send OSD option
Then OSD page should display.

When upload file 
#here we need to specify file name and location that we are going to upload.
Then Upload button should be enabled.

When click UPload button
Then "Upload Success" message should display.

When click Send OSD button
Then



