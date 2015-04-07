Feature: Google search page

  Scenario: User on google main page
    Given I am on google search page
    And I see "searchImage"
    And I see "searchBox"
    And I see "buttonGoogleSearch"
    And I see "buttonImFeelingLucky"