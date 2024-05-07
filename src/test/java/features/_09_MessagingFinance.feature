Feature:

  Scenario:
    Given  I navigate to the Mersys Login page
    Then   I enter correct username and password
      |Student_10|
      |S12345|
    And    I press Login button
    Then   I go to hamburger menu and press Finance link ---> My Finance
    And    I press on a student profile
    Then   I go to Fee Balance Detail
