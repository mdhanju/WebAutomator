Feature: Google search page

  Scenario: Validate googleSearchPage
    Given I am on googleSearchPage
    And I see "linkYou"
    And I see "linkGmail"
    And I click "linkYou"

  Scenario: Validate gmailPage
    Given I am on gmailPage
    Then I see "signInButton"
    And I see "createAnAccountButton"