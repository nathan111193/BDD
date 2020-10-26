$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/Asdahomepage.feature");
formatter.feature({
  "line": 1,
  "name": "homepage functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8978586585,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "checking the homepage",
  "description": "",
  "id": "homepage-functionality;checking-the-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters cake",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user will be able to see the results",
  "keyword": "Then "
});
formatter.match({
  "location": "AsdaHomepage.user_is_on_the_homepage()"
});
formatter.result({
  "duration": 912857101,
  "status": "passed"
});
formatter.match({
  "location": "AsdaHomepage.user_enters_cake()"
});
formatter.result({
  "duration": 19768524247,
  "status": "passed"
});
formatter.match({
  "location": "AsdaHomepage.user_will_be_able_to_see_the_results()"
});
formatter.result({
  "duration": 253419,
  "status": "passed"
});
formatter.after({
  "duration": 10002912378,
  "status": "passed"
});
});