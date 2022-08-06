package apitesting;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;



public class ExtractFieldValuesfromResponse {

    public static void main(String[] args) {
        given().auth().basic("sk_test_51LNAdjSG0BCeOo6hpaenzUvn73Q3zr0m3GN4jGypPPNvGCe0S0Fqv0b0M2koy49BTM74N4hVm6dRJylfDSo5naHp00ASvjyn3F", "")
                .formParam("name", "Mahindra").formParam("email", "wdwd@dwd.com");


                Response resp = given().header("Authorization", "Basic c2tfdGVzdF81MUxOQWRqU0cwQkNlT282aHBhZW56VXZuNzNRM3pyMG0zR040akd5cFBQTnZHQ2UwUzBGcXYwYjBNMmtveTQ5QlRNNzRONGhWbTZkUkp5bGZEU281bmFIcDAwQVN2anluM0Y6")
                .get("https://api.stripe.com/v1/customers/cus_M5O6RzHYvW2RiN");

    }
}
