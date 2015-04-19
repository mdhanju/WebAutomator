Feature:Gmail Log in page

  Scenario: Validate gmailPage
    Given I am on "gmailPage"
    Then I see "emailInput"
    And I see "passwordInput"
    And I see "signInButton"
    And I input "email" in "emailInput"
    And I input "password" in "passwordInput"
    And I click "signInButton"
    And I am on "gmailInboxPage"
    And I see "signOutImage"
    And I click "signOutImage"
    And I see "signOutButton"
    And I click "signOutButton"
    And I am on "gmailPage"

