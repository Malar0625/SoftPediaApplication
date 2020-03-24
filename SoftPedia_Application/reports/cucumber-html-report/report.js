$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/TestScenario.feature");
formatter.feature({
  "line": 2,
  "name": "SoftPedia Application",
  "description": "",
  "id": "softpedia-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@softpedia"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "Register into softpedia web application",
  "id": "softpedia-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_Register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "The user launch and register the application with valid and invalid details",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Register.the_user_launch_and_register_the_application_with_valid_and_invalid_details()"
});
});