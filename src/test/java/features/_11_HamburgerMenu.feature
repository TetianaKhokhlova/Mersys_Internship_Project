Feature: Payment Process

  Scenario: Verify remaining debt decreases by payment amount and debt amount is updated correctly
    Given I navigate to the Mersys Login page
    And   I enter correct username and password
      |Student_10|
      |S12345|
    Then  I press Login button
    Given the student is logged in
    And navigate To the Payment Page
    When the student selects Stripe as the payment method
    And enters the payment amount
    And makes the payment
    Then the remaining debt decreases by the payment amount
    And the debt amount is updated correctly after the payment
    And the student receives a success message confirming the payment
