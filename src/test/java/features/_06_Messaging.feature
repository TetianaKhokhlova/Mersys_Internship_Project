Feature:

  Scenario:
    Given  I navigate to the Mersys Login page
    Then   I enter correct username and password
      |Student_10|
      |S12345|
    And    I press Login button
    Then   I press on hamburger menu, choose Messaging and go to Outbox link
    And    I press on garbage box icon to delete message and see the confirmation message of deleting
    Then   I should see the message about deleting