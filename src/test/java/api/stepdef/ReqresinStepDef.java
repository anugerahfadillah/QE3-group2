package api.stepdef;


import io.cucumber.java.en.*;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ReqresinStepDef {

    //Create API -- Begin
    @And("user send POST create request to reqresin")
    public void postCreate(){
        reqresin.postCreate();
    }
    @Then("response status code should be {int}")
    public void statusCodeValidation(int statusCode){
        restAssuredThat(response -> response.statusCode(statusCode));
    }
    //Create API -- End
}
