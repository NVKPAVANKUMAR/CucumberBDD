$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/signup_json.feature");
formatter.feature({
  "line": 1,
  "name": "The purpose of this feature is to test End 2 End integration.",
  "description": "",
  "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Loginup Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user assert title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on signUp link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "browser navigated to signUp Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter \"\u003ccustomer\u003e\" personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "quit the browser instance",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.;customer-place-an-order-by-purchasing-an-item-from-search;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 11,
      "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.;customer-place-an-order-by-purchasing-an-item-from-search;;1"
    },
    {
      "cells": [
        "Virender"
      ],
      "line": 12,
      "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.;customer-place-an-order-by-purchasing-an-item-from-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "the-purpose-of-this-feature-is-to-test-end-2-end-integration.;customer-place-an-order-by-purchasing-an-item-from-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Loginup Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user assert title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on signUp link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "browser navigated to signUp Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter \"Virender\" personal details on checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "quit the browser instance",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpPageSteps.user_is_on_Loginup_Page()"
});
formatter.result({
  "duration": 17693110306,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.user_assert_title_of_login_page_is_FreeCRM()"
});
formatter.result({
  "duration": 8403620,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.user_clicks_on_signUp_link()"
});
formatter.result({
  "duration": 21390797889,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.browser_navigated_to_signUp_Page()"
});
formatter.result({
  "duration": 5275302,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virender",
      "offset": 7
    }
  ],
  "location": "SignUpPageSteps.enter_personal_details_on_checkout_page(String)"
});
formatter.result({
  "duration": 44018879699,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPageSteps.quit_the_browser_instance()"
});
formatter.result({
  "duration": 1003866165,
  "status": "passed"
});
});