Feature: Validate Footer

  Scenario: User should see footer
    Given I am on google search page
    Then I see "linkAdvertising"
    And I see "linkBusiness"
    And I see "linkAbout"
    And I see "linkPrivacy"
    And I see "linkTerms"
    And I see "linkSettings"
