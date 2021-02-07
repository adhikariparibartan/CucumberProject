$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user lands on facebook login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"\u003cusername\u003e\" username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user should land on home page with title  \"\u003ctitle\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;",
  "rows": [
    {
      "cells": [
        "url",
        "username",
        "password",
        "title"
      ],
      "line": 13,
      "id": "login-into-account;login-to-account-with-credentials;;1"
    },
    {
      "cells": [
        "http://www.facebook.com/",
        "anticbaby@gmail.com",
        "qaclass123",
        "Facebook - Log In or Sign Up"
      ],
      "line": 14,
      "id": "login-into-account;login-to-account-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6537109700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user navigates to \"http://www.facebook.com/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user lands on facebook login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the \"anticbaby@gmail.com\" username",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"qaclass123\" password",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user should land on home page with title  \"Facebook - Log In or Sign Up\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.facebook.com/",
      "offset": 19
    }
  ],
  "location": "LoginSteps.user_navigates_to(String)"
});
formatter.result({
  "duration": 4326214600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_lands_on_facebook_login_page()"
});
formatter.result({
  "duration": 14433300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anticbaby@gmail.com",
      "offset": 17
    }
  ],
  "location": "LoginSteps.user_enters_the_username(String)"
});
formatter.result({
  "duration": 258850600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qaclass123",
      "offset": 16
    }
  ],
  "location": "LoginSteps.user_enter_the_password(String)"
});
formatter.result({
  "duration": 152958100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 107426700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Facebook - Log In or Sign Up",
      "offset": 47
    }
  ],
  "location": "LoginSteps.the_user_should_land_on_home_page_with_title(String)"
});
formatter.result({
  "duration": 5960754000,
  "status": "passed"
});
formatter.after({
  "duration": 108317600,
  "status": "passed"
});
});