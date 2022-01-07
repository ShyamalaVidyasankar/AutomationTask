$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RestAPIAutomation.feature");
formatter.feature({
  "line": 2,
  "name": "API Automation for reqres application",
  "description": "",
  "id": "api-automation-for-reqres-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Api"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify get list of user api endpoint",
  "description": "",
  "id": "api-automation-for-reqres-application;verify-get-list-of-user-api-endpoint",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User send get request with \u0027https://reqres.in/api/users?page\u003d2\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verify json path \u0027page\u0027 and value \u00272\u0027 present in the response",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in/api/users?page\u003d2",
      "offset": 28
    }
  ],
  "location": "RestSteps.User_send_get_request_with(String)"
});
formatter.result({
  "duration": 5583450000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "page",
      "offset": 23
    },
    {
      "val": "2",
      "offset": 40
    }
  ],
  "location": "RestSteps.user_verify_json_path_and_value(String,String)"
});
formatter.result({
  "duration": 1512203700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify add user to list",
  "description": "",
  "id": "api-automation-for-reqres-application;verify-add-user-to-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User send post request with \u0027https://reqres.in/api/users\u0027 with body \u0027{\"name\": \"morpheus\",\"job\": \"leader\"}\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User verify json path \u0027name\u0027 and value \u0027morpheus\u0027 present in the response",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in/api/users",
      "offset": 29
    },
    {
      "val": "{\"name\": \"morpheus\",\"job\": \"leader\"}",
      "offset": 69
    }
  ],
  "location": "RestSteps.User_send_gpost_request_with(String,String)"
});
formatter.result({
  "duration": 928451900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 23
    },
    {
      "val": "morpheus",
      "offset": 40
    }
  ],
  "location": "RestSteps.user_verify_json_path_and_value(String,String)"
});
formatter.result({
  "duration": 26312500,
  "status": "passed"
});
});