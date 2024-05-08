
Feature: Enhanced Search on the "Assign" page
  Scenario:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
    When the student clicks the search button
    Then all assigned tasks should be listed

    When the student filters by "Course," "Status," "Semester" and "Day Due"
    Then the filtered tasks should be displayed

    When the student clicks "Show Only Marked"
    Then the results should be listed and sorted by "Course," "Genre," "History," or "Table"