Feature: Navigation to Home Page
  As a User, when I click on the logo at the top left of the home page,
  I should be able to reach the home page of the course so that I can
  navigate faster when I want to get general information about the course.

  Background:
    Given the user is logged into the system as a student

  Scenario: User clicks on the company logo
    Given the user sees the company logo at the top left
    When the user clicks on the company logo
    Then the user should be directed to "https://techno.study"
