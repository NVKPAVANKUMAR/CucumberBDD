Feature: The purpose of this feature is to test End 2 End integration.

  Scenario Outline: Customer place an order by purchasing an item from search
    Given user is on Loginup Page
    When user assert title of login page is FreeCRM
    Then user clicks on signUp link
    Then browser navigated to signUp Page
    And enter "<customer>" personal details on checkout page
    Then quit the browser instance
    Examples:
      |customer|
      |Virender|