package apitesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class SendPOSTRequest {

    public static void main(String[] args) {
        // Response resp = given().auth().basic("sk_test_51LNAdjSG0BCeOo6hpaenzUvn73Q3zr0m3GN4jGypPPNvGCe0S0Fqv0b0M2koy49BTM74N4hVm6dRJylfDSo5naHp00ASvjyn3F", "")
        //       .formParam("name", "Tielemans").formParam("description","Sending first POST request through RestAsssured").formParam("email","youri@leicester.com")
        //        .post("https://api.stripe.com/v1/customers");

        //Sending Post request using JSON body
      //  String jsonBody = "{ \"email\" : \"eve.holt@reqres.in\", \"password\" :\"pistol\" }";
        HashMap<String,String> jsonBody = new HashMap<>();
        jsonBody.put("email", "eve.holt@reqres.in");
        jsonBody.put("firstname", "pistol");
        jsonBody.put("lastName", "dhokla");


//        Response resp = given().contentType(ContentType.JSON).body(jsonBody)
//                      .post("http://localhost:8080/api/users");
        Response resp = given().contentType(ContentType.JSON).body(new File("./users.json")).log().all()
                       .post("http://localhost:8080/api/users");
        System.out.println(resp.getStatusCode());
        Response re = given().contentType(ContentType.JSON)
                .get("http://localhost:8080/api/users");
        re.prettyPrint();
    }
}
