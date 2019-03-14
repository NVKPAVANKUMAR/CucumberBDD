 Free CRM Signup Feature

  Scenario Outline:
    Given user is on Login Page
    When title of login page is FreeCRM
    Then user clicks on signUp button
    Then browser navigated to Registration Page
    Then User enters "<Paymentplan>" and "<FirstName>" and "<LastName>" and "<Email>" and "<Username>" and "<Password>" and "<ConfirmPassword>"
    Then close the browser instance
    Examples:
      | Paymentplan  | FirstName | LastName | Email            | Username | Password | ConfirmPassword |
      | Free Edition | Test      | 123      | test123@mail.com | Test123  | password | password        |

