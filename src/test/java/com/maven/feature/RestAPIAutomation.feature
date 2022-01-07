@Api
Feature: API Automation for reqres application


Scenario: Verify get list of user api endpoint
When User send get request with 'https://reqres.in/api/users?page=2'
Then User verify json path 'page' and value '2' present in the response

Scenario: Verify add user to list 
When User send post request with 'https://reqres.in/api/users' with body '{"name": "morpheus","job": "leader"}'
Then User verify json path 'name' and value 'morpheus' present in the response

Scenario: Verify add user to list 
When User send post request with 'https://reqres.in/api/users/2' with body '{"name": "morpheus","job": "zion resident"}'
Then User verify json path 'job' and value 'zion resident' present in the response