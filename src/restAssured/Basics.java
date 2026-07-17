package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; //eclipse does not give auto-suggestion for static imports

import files.payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//validate if addPlaceapi is working as expected
		
		//given - load all input details
		//when - submit the request; set the HTTP method, resource
		//then - validate the response

		
			RestAssured.baseURI = "https://www.rahulshettyacademy.com";
			
			String response = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
			.body(payload.AddPlace()).
			when().post("/maps/api/place/add/json").
			then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
			.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
			
			System.out.println(response);
			
			JsonPath js = new JsonPath(response);
			
		   String place_id = js.getString("place_id");
		   
		   System.out.println(place_id);
	}

}
