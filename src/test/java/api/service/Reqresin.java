package api.service;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class Reqresin {

    private static final String REQRESIN_BASEURL = "https://reqres.in";

    public void postCreate(){

        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "leader");
        bodyJson.put("updatedAt", "2022-04");

        SerenityRest.given().header("Content-type", "application/json").body(bodyJson.toString()).post(REQRESIN_BASEURL + "/api/users");
    }
}
