package apitesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class CreatingJSONinRuntime {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("email", "prasa@fef.com");
        jsonObject.put("name", "prasad");
        jsonObject.put("city", "LA");

        JSONArray listOfMobiles = new JSONArray();
        listOfMobiles.put("343212");
        listOfMobiles.put("45465656");

        jsonObject.put("mobile", listOfMobiles);

        JSONObject address = new JSONObject();
        address.put("state","Karnataka");
        address.put("street","LTT Road");
        address.put("city","Mangalore");

        jsonObject.put("address", address);
        Response resp = given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all().post("http://localhost:8080/api/users");
        resp.prettyPrint();

    }
}
