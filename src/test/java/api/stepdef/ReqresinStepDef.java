package api.stepdef;

import api.service.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ReqresinStepDef {
    Reqresin reqresinAPI = new Reqresin();

    //Create API -- Begin
    @And("user send POST create request to reqresin")
    public void postCreate(){
        reqresinAPI.postCreate();
    }
    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode){
        restAssuredThat(response -> response.statusCode(statusCode));
    }
    @And("response structure should match json schema {string}")
    public void responseStructureShouldMatchJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }
    //Create API -- End
}
