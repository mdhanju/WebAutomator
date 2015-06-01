Feature: Yahoo page

  Scenario Outline: Validate yahooPage
    Given I am on "yahooPage"
    Then I see "uhSearchBoxInput"
    And I see "searchWebButton"
    And I input "<text>" in "uhSearchBoxInput"
    And I click "searchWebButton"
    Examples:
      | text        |
      | searchText  |
      | searchText1 |
