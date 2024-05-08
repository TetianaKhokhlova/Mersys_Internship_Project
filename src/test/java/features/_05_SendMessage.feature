Feature:

  Background:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button

  Scenario:
    Given I need to click on the Hamburger menu
    And I should be able to click on the messaging
    And I should be able to click on the new message
    Then I need to click on Add Receiver icon
    And I need to write user name "student"
    Then I should be able to choose two student
     Then I choose another student
    And I need to click on Add button
    And I should delete word "student"
    Then I should be able to write user name "teacher"
    And I should be able to choose one teacher
    Then I need to click on Add & Close button
    Then I need to write a subject "git branching"
    Then I need write text message "How can I create a new branch from my repo?"
    And I need to add Attach File
    Then I need to choose From local laptop
    Then I upload a file
    Then I need to choose file
    Then I need to click on send button
    Then I need to click on the hamburger menu
    And Navigate to click on the messaging
    Then I need to click on Outbox button
