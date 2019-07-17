Feature: Add new users to list

  Scenario: Create new user
    Given I open the service url
    When I make a post request to "/posts" endpoint with "F:\IntervTest\JPMorganTest\post.json"
    Then I verify post is successful with status code "201"