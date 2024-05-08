Feature:


  Background:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button


    Scenario:
      Given I need to click on the hamburger menu
      And I should be able to click on the Messaging
      And I should be able to click on the New message
      Then I need to click on the hamburger menu2
      And I should be able to click on the Messaging2
      And I should be able to click on the inbox button
      Then I need to click on the hamburger menu3
      And I should be able to click on the Messaging3
      And I should be able to click on the outbox button
      Then I need to click on the hamburger menu4
      And I should be able to click on the Messaging4
      Then I should be able to click on the trash button