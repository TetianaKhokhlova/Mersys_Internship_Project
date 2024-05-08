Feature: Hamburger Menu / Finance on Campus

Background: Login
  Given I navigate to the Mersys Login page
  And   I enter correct username and password
    |Student_10|
    |S12345|
  Then  I press Login button

  Scenario: Hamburger Menu / Finance
    Given I click on the Hamburger Menu
    And I click on Financepage
    And I click on My Finance
    Then I should verify the homepage

