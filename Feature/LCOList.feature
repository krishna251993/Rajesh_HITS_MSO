#Autho: Sakshi Jain
Feature: This feature is used to see the information about the different LCOs under this MSO.

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
    Then Change Transfer Limit Pop up should display
    When you enter new Limit and click Change button
      | 10002 |
    Then "Limit Changed Successfully" message should display.
    When you click Close button for close the change limit Pop UP
