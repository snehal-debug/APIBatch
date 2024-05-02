package Org.testing.testScripts;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingExampleMultiple {

	public static void main(String[] args) {
	
		
		{
			Response res =
					given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudents");
			 System.out.println(res.asString());
			 
			 JSONArray j = new JSONArray(res.asString());//JSONARRAY Object
			 int L = j.length();
			 for (int i=0;i<L;i=i+1) {
			
			 
				
			 JSONObject ob = j.getJSONObject(i);// JSONObject object
			 System.out.println(ob.get("id"));
			 
			 }
		}

	}

}
