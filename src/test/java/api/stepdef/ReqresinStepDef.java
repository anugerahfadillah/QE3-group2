package api.stepdef;


import api.service.Reqresin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ReqresinStepDef {

    Reqresin reqresin = new Reqresin();

    // Action

    @And("user send POST register request to reqresin")
    public void postRegister() {
        reqresin.postRegister();
    }

    @And("user send POST invalid register request to reqresin")
    public void postInvalidRegister() {
        reqresin.postInvalidRegister();
    }

    @And("user send PUT Update request to reqresin")
    public void putUpdate() {
        reqresin.putUpdate();
    }

    //validation

    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @Then("response structure should match json schema {string}")
    public void validateJsonSchema(String schema) {
        String path = String.format("schema/%s", schema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(path)));
    }


}

