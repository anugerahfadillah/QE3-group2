package api.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqresin {

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    public void putUpdate() {
        JSONObject bodyJSON = new JSONObject();
        bodyJSON.put("name", "morpheus");
        bodyJSON.put("job", "zion resident");

        SerenityRest.given()
                .header("Content-type", "application/json")
                .body(bodyJSON.toString())
                .put(REQRESIN_BASEURL + "/api/users/2");
    }
}
