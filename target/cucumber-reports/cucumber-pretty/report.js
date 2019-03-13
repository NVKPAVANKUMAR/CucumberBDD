$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "naveenk",
        "test@123"
      ],
      "line": 15,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"naveenk\" and \"test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 22918888891,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 7656113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "test@123",
      "offset": 27
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 508523386,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 11955108371,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_hopme_page()"
});
formatter.result({
  "duration": 6142867,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 1179529539,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Signup Feature",
  "description": "",
  "id": "free-crm-signup-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "",
  "id": "free-crm-signup-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on signUp button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "browser navigated to Registration Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"\u003cPaymentplan\u003e\" and \"\u003cFirstName\u003e\" and \"\u003cLastName\u003e\" and \"\u003cEmail\u003e\" and \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\" and \"\u003cConfirmPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser instance",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "free-crm-signup-feature;;",
  "rows": [
    {
      "cells": [
        "Paymentplan",
        "FirstName",
        "LastName",
        "Email",
        "Username",
        "Password",
        "ConfirmPassword"
      ],
      "line": 11,
      "id": "free-crm-signup-feature;;;1"
    },
    {
      "cells": [
        "Free Edition",
        "Test",
        "123",
        "test123@mail.com",
        "Test123",
        "password",
        "password"
      ],
      "line": 12,
      "id": "free-crm-signup-feature;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "free-crm-signup-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of login page is FreeCRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on signUp button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "browser navigated to Registration Page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters \"Free Edition\" and \"Test\" and \"123\" and \"test123@mail.com\" and \"Test123\" and \"password\" and \"password\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser instance",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpStepDefinition.user_on_login_page()"
});
formatter.result({
  "duration": 15843008719,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.title_of_login_page_is_freeCRM()"
});
formatter.result({
  "duration": 8522532,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.user_clicks_on_signUp_button()"
});
formatter.result({
  "duration": 14355021103,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.browser_navigated_to_Registration_Page()"
});
formatter.result({
  "duration": 4603453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Free Edition",
      "offset": 13
    },
    {
      "val": "Test",
      "offset": 32
    },
    {
      "val": "123",
      "offset": 43
    },
    {
      "val": "test123@mail.com",
      "offset": 53
    },
    {
      "val": "Test123",
      "offset": 76
    },
    {
      "val": "password",
      "offset": 90
    },
    {
      "val": "password",
      "offset": 105
    }
  ],
  "location": "SignUpStepDefinition.user_enters_and_and_and_and_and_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1329025703,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.close_the_browser_instance()"
});
formatter.result({
  "duration": 1290332693,
  "status": "passed"
});
});