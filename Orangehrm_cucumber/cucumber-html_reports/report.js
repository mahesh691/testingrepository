$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ohrm.feature");
formatter.feature({
  "line": 2,
  "name": "functional testing of orangehrm",
  "description": "",
  "id": "functional-testing-of-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login test by welcome text",
  "description": "",
  "id": "functional-testing-of-orangehrm;login-test-by-welcome-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "application open",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "login function",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "validation test",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_homepage.open_browser()"
});
formatter.result({
  "duration": 6540946839,
  "status": "passed"
});
formatter.match({
  "location": "Test_homepage.application_open()"
});
formatter.result({
  "duration": 1004123546,
  "status": "passed"
});
formatter.match({
  "location": "Test_homepage.login_function()"
});
formatter.result({
  "duration": 1460246214,
  "status": "passed"
});
formatter.match({
  "location": "Test_homepage.validation_test()"
});
formatter.result({
  "duration": 16842818775,
  "status": "passed"
});
});