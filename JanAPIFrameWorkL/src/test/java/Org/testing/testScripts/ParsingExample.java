package Org.testing.testScripts;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExample {
	
	
	public static void main(String[] args) 
	{
		Response res =
				given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudents");
		 System.out.println(res.asString());
		 JSONArray j = new JSONArray(res.asString());//JSONARRAY Object
		 JSONObject ob = j.getJSONObject(0);// JSONObject object
		 System.out.println(ob.get("id"));
		
	}

}
