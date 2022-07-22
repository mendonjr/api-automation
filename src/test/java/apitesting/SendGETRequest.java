package apitesting;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class SendGETRequest {
    /*
     Set Authentication - Basic Auth / Bearer token using Headers

     *Request ---> Set of request specifications

     * Response - Do validation

     */
    public static void main(String[] args) {
       Response response =  given().auth().basic("sk_test_51LNAdjSG0BCeOo6hpaenzUvn73Q3zr0m3GN4jGypPPNvGCe0S0Fqv0b0M2koy49BTM74N4hVm6dRJylfDSo5naHp00ASvjyn3F", "")
                .get("https://api.stripe.com/v1/customers");

      //  response.prettyPrint();
        String jsonresponse = response.asString();
        //System.out.println(jsonresponse);
        System.out.println("Response code is : " +response.statusCode());


        /* Different ways of specifying content type in headers
       // given().contentType(ContentType.JSON);
       // given().contentType("application/JSON");
       // given().header("content-type", "application/JSON").auth().basic(username,password);
       */




    }
}
