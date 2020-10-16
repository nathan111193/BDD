$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/Homepage1.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 34,
  "name": "Enter multiple products",
  "description": "",
  "id": "homepage-functionality;enter-multiple-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@DoubleOutput"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user search for \"\u003citems\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user can see multiple items",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "homepage-functionality;enter-multiple-products;",
  "rows": [
    {
      "cells": [
        "items"
      ],
      "line": 39,
      "id": "homepage-functionality;enter-multiple-products;;1"
    },
    {
      "cells": [
        "rado"
      ],
      "line": 40,
      "id": "homepage-functionality;enter-multiple-products;;2"
    },
    {
      "cells": [
        "armani"
      ],
      "line": 41,
      "id": "homepage-functionality;enter-multiple-products;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15347512954,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Enter multiple products",
  "description": "",
  "id": "homepage-functionality;enter-multiple-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@DoubleOutput"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user search for \"rado\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user can see multiple items",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage1_searchbox.user_is_on_the_homepage_of_the_Argos_website()"
});
formatter.result({
  "duration": 2154468526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rado",
      "offset": 17
    }
  ],
  "location": "Resultpage_DoubleOutput.user_search_for(String)"
});
formatter.result({
  "duration": 3470170956,
  "status": "passed"
});
formatter.match({
  "location": "Resultpage_DoubleOutput.user_can_see_multiple_items()"
});
formatter.result({
  "duration": 66328,
  "status": "passed"
});
formatter.after({
  "duration": 11354742280,
  "status": "passed"
});
formatter.before({
  "duration": 10471206650,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "Enter multiple products",
  "description": "",
  "id": "homepage-functionality;enter-multiple-products;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 33,
      "name": "@DoubleOutput"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "User is on the homepage of the Argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user search for \"armani\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user can see multiple items",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage1_searchbox.user_is_on_the_homepage_of_the_Argos_website()"
});
formatter.result({
  "duration": 378112690,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "armani",
      "offset": 17
    }
  ],
  "location": "Resultpage_DoubleOutput.user_search_for(String)"
});
formatter.result({
  "duration": 3686316384,
  "status": "passed"
});
formatter.match({
  "location": "Resultpage_DoubleOutput.user_can_see_multiple_items()"
});
formatter.result({
  "duration": 43240,
  "status": "passed"
});
formatter.after({
  "duration": 11247533943,
  "status": "passed"
});
});