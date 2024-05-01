Feature:  Mersys Login Page

  Scenario:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
    Then I should see the following main menu items at the top of the home page:
     | Courses      |
      | Calendar     |
      | Attendance   |
      | Assignments  |
      | Grading      |
     | Hamburger Menu |
    Then I should see the following Message items:

     | Messaging       | new message|
      | Finance         | My Finance |
      | Video Conference| Video Meeting|
      | Surveys         | My Surveys   |
    Then I should see the following File in the dropdown menu:
      | My Certificates  |
      | My Files         |
      | Change Password  |
      | Settings         |

    And I should see Sign Out








