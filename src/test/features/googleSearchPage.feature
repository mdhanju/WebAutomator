Feature: Google search page

  Scenario: User is  on googleSearchPage
    Given I am on google search page
    And I see "searchImage"
    And I see "searchBox"
    And I see "buttonGoogleSearch"
    And I see "buttonImFeelingLucky"


  Scenario: User log in to gmailPage
    Given I am on Log In page for gmail
    Then I see "textOneAccountAllOfGoogle"
    And I see "textSignInToContinueToGmail"
    And I see "labelEmail"
    And I see "labelPassword"
    And I see "editboxEmail"
    And I see "editboxPassword"
    And I see "buttonSignIn"
    And I see "checkboxStaySignedIn"
    And I see "labelStaySignedIn"
