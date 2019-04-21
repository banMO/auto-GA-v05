# Login feature review the behavior in thie feature
Feature: Login

  Scenario: Home page is displayed once set credential in login page
    Given 'PHP travel' page is loaded
    And set my credentials on 'Login' page


  Scenario: POSTMAN- GET using java-cucumber-restassure
    Given GET "/headers" postman endpoint is configured
    Then the status code should be 200

  Scenario Outline: POSTMAN- POST using java-cucumber-restassure
    Given POST "<resourseEndpoint>" postman endpoint is configured with this body "<data>"
    Then the response 'data' value is "<expectedResult>"
    And the status code should be 200
    Examples:
      |resourseEndpoint|       data      |  expectedResult   |
      |     /post      |diplomado testing| diplomado testing |

  Scenario Outline: POSTMAN- POST using java-cucumber-restassure with incorrect resource
    Given POST "<resourseEndpoint>" postman endpoint is configured with this body "<data>"
    Then the status code should be 404
    Examples:
      |resourseEndpoint|       data       |
      |     /postt      |diplomado testing|