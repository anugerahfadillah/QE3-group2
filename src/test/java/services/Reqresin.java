package api.service.reqresin;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqresin {

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    public void postRegister() {

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password", "cityslicka");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/register");
    }

    public void postInvalidRegister() {

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "sydney@fife");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(REQRESIN_BASEURL + "/api/register");
    }
}