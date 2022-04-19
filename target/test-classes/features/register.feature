@register
Feature: Register

  @POST-success @positive
  Scenario: Success POST register
    When user send POST register request to reqresin
    Then response status code should be 200
    And response structure should match json schema "register.json"

  @POST-unsuccess @negatif
  Scenario: Unsuccess POST register
    When user send POST invalid register request to reqresin
    Then response status code should be 400
    And response structure should match json schema "unsuccess-register.json"
