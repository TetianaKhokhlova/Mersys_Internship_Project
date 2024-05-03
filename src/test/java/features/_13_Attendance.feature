Feature: Attendance page Mersys

  Background: Login
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button

  Scenario: Attendance excuse
    Given I click on Attendance menu
    And I click on Attendance excuse page
    And I click on add Attendance excuse button
    And I enter my excuse message in the message textbox
    And I click on Attach Files button
    And I click on From My Files button
    And I click on a File
    And I click on Select button
    And I click on Send button
    Then I should verify the popup message