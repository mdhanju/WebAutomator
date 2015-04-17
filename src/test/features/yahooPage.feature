Feature: Yahoo page

  Scenario: Validate yahooPage
    Given I am on "yahooPage"
    Then I see "uhSearchBoxInput"
    And I see "searchWebButton"
    And I input "yahoo finance" in "uhSearchBoxInput"
    And I click "searchWebButton"