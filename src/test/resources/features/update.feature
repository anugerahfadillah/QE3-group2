Feature: Update User

  Scenario: Success PUT Update
    When user send PUT Update request to reqresin
    Then response status code should be 200
    And response structure should match json schema "update-user.json"
