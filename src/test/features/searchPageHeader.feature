Feature: Validate Search Page Header

  Scenario: User should see google search page header
    Given I am on google search page
    Then I see "linkYou"
    And I see "linkGmail"
    And I see "linkImages"
    And I see "buttonSignIn"
