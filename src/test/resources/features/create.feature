Feature: Reqresin

  @POST @Create @positif
  Scenario: Success POST Create
    When  user send POST create request to reqresin
    Then response status code should be 201
    And response structure should match json schema "create.json"