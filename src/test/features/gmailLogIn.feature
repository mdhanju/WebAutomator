Feature: Log in

  Scenario: User log in to gmail
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
