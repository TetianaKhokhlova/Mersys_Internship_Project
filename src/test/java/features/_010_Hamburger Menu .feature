Feature: Mersys Home Page
  Background:
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button


  Scenario: Student makes a payment using Stripe
    Given  that i navigates to the payment page through Hamburger Menu
    Then   i click Finance
    Then   i click  My Finance
    Then   i click view icon to open payment method
    And    i selects Stripe as the payment method
    And    i enters "235" dollars  as the payment amount
            |235|
    And    i completes the payment process
    Then   the payment amount should be correctly determined as "235" dollars
    And    i  should receive a payment confirmation
    Then    my  debt status should be updated



