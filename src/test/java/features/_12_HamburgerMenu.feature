Feature: Download Payment and Debt Details

  Scenario: Verify downloading payment and debt details in Excel and PDF formats
    Given I navigate to the Mersys Login page
    When the student navigates to the payment page via Hamburger Menu > Finance > My Finance
    And clicks on the three-point drop-down menu button for report options
    And selects the Excel option from the drop-down menu
    And downloads the Excel report to the local drive
    Then the student opens the downloaded Excel file and verifies the content
    And repeats steps 2-5, but this time selects the PDF option from the drop-down menu and downloads the report
    And the student opens the downloaded PDF file and verifies the content


