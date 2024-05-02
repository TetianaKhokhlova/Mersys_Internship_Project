Feature: Profile Picture Management
  Scenario:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
    When the student clicks on the "Profile > Settings" link
Then the profile settings page should be displayed