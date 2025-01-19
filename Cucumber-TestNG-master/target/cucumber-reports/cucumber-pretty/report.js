$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Validate ebay search Functionality",
  "description": "",
  "id": "validate-ebay-search-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate ebay search and add to card count functionality",
  "description": "",
  "id": "validate-ebay-search-functionality;validate-ebay-search-and-add-to-card-count-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@DryRun1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user has launched the application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#\tWhen title of login page is \"\u003cTitle\u003e\""
    }
  ],
  "line": 8,
  "name": "user enters \"\u003cSearchItem\u003e\" in search box",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on first search option",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Item link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add to Card button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "validate-ebay-search-functionality;validate-ebay-search-and-add-to-card-count-functionality;",
  "rows": [
    {
      "cells": [
        "SearchItem"
      ],
      "line": 17,
      "id": "validate-ebay-search-functionality;validate-ebay-search-and-add-to-card-count-functionality;;1"
    },
    {
      "cells": [
        "Books"
      ],
      "line": 18,
      "id": "validate-ebay-search-functionality;validate-ebay-search-and-add-to-card-count-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Validate ebay search and add to card count functionality",
  "description": "",
  "id": "validate-ebay-search-functionality;validate-ebay-search-and-add-to-card-count-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@DryRun1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user has launched the application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#\tWhen title of login page is \"\u003cTitle\u003e\""
    }
  ],
  "line": 8,
  "name": "user enters \"Books\" in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on first search option",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Item link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Add to Card button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 5154288699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String)"
});
formatter.result({
  "duration": 417505800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_First_search_opt()"
});
formatter.result({
  "duration": 6297846701,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_Item_link()"
});
formatter.result({
  "duration": 5665534399,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_addToCard_Button()"
});
formatter.result({
  "duration": 2248882400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 109431799,
  "status": "passed"
});
