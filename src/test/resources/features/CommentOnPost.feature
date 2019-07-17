Feature: Comment on post

  Scenario: Add comment to post
    Given I open the service url
    When I make a post request to "/comments" endpoint with "F:\IntervTest\JPMorganTest\postComment.json"
    Then I verify post is successful with status code "201"