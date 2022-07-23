package apitesting;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import static io.restassured.RestAssured.*;
public class PassComplexJSONinBody {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("firstName", "Prasad");
        map.put("lastName", "Mendon");
        map.put("country", "India");
        map.put("email", "prasadmendon744@gmail.com");

        ArrayList<Integer> listofmobilenos = new ArrayList<>();
        listofmobilenos.add(7656556);
        listofmobilenos.add(7676555);


        HashMap<String,Object> address = new HashMap<>();
        address.put("state","Karnataka");
        address.put("street","LTT Road");
        address.put("mobile", listofmobilenos);
        address.put("city","Mangalore");

        map.put("address", address);

        Response resp = given().contentType(ContentType.JSON).body(map).log().all().post("http://localhost:8080/api/users");
        resp.prettyPrint();
//        Response re = given().contentType(ContentType.JSON)
//                .get("http://localhost:8080/api/users");
//        re.prettyPrint();
    }


}

