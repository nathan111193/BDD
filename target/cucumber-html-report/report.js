$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/Homepage1.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Search for multiple products",
  "description": "",
  "id": "homepage-functionality;search-for-multiple-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Multipleinput"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user search for\"\u003cproducts\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user can see multiple products",
  "keyword": "Then "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "homepage-functionality;search-for-multiple-products;",
  "rows": [
    {
      "cells": [
        "products"
      ],
      "line": 28,
      "id": "homepage-functionality;search-for-multiple-products;;1"
    },
    {
      "cells": [
        "nike"
      ],
      "line": 29,
      "id": "homepage-functionality;search-for-multiple-products;;2"
    },
    {
      "cells": [
        "puma"
      ],
      "line": 30,
      "id": "homepage-functionality;search-for-multiple-products;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9130406539,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Search for multiple products",
  "description": "",
  "id": "homepage-functionality;search-for-multiple-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Multipleinput"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user search for\"nike\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user can see multiple products",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage1_searchbox.user_is_on_the_homepage_of_the_Argos_website()"
});
formatter.result({
  "duration": 1091173263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nike",
      "offset": 16
    }
  ],
  "location": "Homepage_scenarioOutlinesSteps.user_search_for(String)"
});
formatter.result({
  "duration": 4435067741,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_scenarioOutlinesSteps.user_can_see_multiple_products()"
});
formatter.result({
  "duration": 34687,
  "status": "passed"
});
formatter.after({
  "duration": 69345,
  "status": "passed"
});
formatter.before({
  "duration": 5434127865,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Search for multiple products",
  "description": "",
  "id": "homepage-functionality;search-for-multiple-products;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@Multipleinput"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user search for\"puma\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user can see multiple products",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage1_searchbox.user_is_on_the_homepage_of_the_Argos_website()"
});
formatter.result({
  "duration": 313025225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "puma",
      "offset": 16
    }
  ],
  "location": "Homepage_scenarioOutlinesSteps.user_search_for(String)"
});
formatter.result({
  "duration": 5113966875,
  "status": "passed"
});
formatter.match({
  "location": "Homepage_scenarioOutlinesSteps.user_can_see_multiple_products()"
});
formatter.result({
  "duration": 40171,
  "status": "passed"
});
formatter.after({
  "duration": 30498,
  "status": "passed"
});
});