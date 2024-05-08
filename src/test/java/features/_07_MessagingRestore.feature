Feature:

  Scenario:

    Given  I navigate to the Mersys Login page
    Then   I enter correct username and password
      |Student_10|
      |S12345|
    And    I press Login button
    Then   I press on hamburger menu, choose Messaging and go to Trash link
    And    I should see a the trash bin icon and click on it , but don't confirm deleting
    Then   I should click on  the restore icon to get a deleted message back and receive that the message was successfully taken back
