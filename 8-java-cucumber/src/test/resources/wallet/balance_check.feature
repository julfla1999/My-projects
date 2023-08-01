Feature: Display balance
  Scenario: User checks the ballance of their wallet
    Given there is $100 in my wallet
    When  I check the balance
    Then  I should see that the balance is $100
