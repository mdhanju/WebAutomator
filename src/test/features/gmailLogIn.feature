Feature:G-Mail Log in page

  Scenario: Validate gmailPage
    Given I am on "gmailPage"
    Then I see "emailInput"
    And I see "passwordInput"
    And I see "signInButton"
