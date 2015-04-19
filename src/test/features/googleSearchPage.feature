Feature: Google search page

  Scenario: Validate googleSearchPage
    Given I am on "googleSearchPage"
    And I see "youLink"
    And I see "gmailLink"
    And I see "imagesLink"
    When I click "gmailLink"
    Then I am on "gmailPage"
