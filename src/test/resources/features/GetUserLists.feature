Feature: Get users lists

  @test
Scenario: Get number of users in the list
  Given I make GET request to "/users" endpoint
    When I receive response status
    Then I verify response contains "10" users