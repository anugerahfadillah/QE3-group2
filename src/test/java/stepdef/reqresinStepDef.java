package api.stepdef.reqresin;


import api.service.reqresin.Reqresin;
import io.cucumber.java.en.And;

public class reqresinStepDef {

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

}