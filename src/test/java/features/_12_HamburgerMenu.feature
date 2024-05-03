Feature: Download Payment and Debt Details

  Background: : Verify remaining debt decreases by payment amount and debt amount is updated correctly
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
  Scenario: Verify downloading payment and debt details in Excel and PDF formats
    When the student navigates to the payment page via Hamburger Menu > Finance > My Finance
    And clicks on the three-point drop-down menu button for report options
    Then the student opens the downloaded Excel file and verifies the content
    And the student opens the downloaded PDF file and verifies the content


