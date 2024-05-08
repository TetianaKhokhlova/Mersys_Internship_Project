Feature: Efficient Homework Interaction

  Scenario:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
    And I am logged in as a student on the homework list page
    When I click on a homework item area outside of its icons
    Then I should see the details page and icons for information, submission, favorites, and discussions if available