package Org.testing.testScripts;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingAllKeys {
	
public static void main(String[] args) {
	
		
		{
			Response res =
					given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudents");
			 System.out.println(res.asString());
			 
			 JSONArray array = new JSONArray(res.asString());//JSONARRAY Object
			 int L = array.length();
			 for(int i=0;i<L;i=i+1) {
				
			 JSONObject obj = array.getJSONObject(i);// JSONObject object
			 Set<String> allKeys = obj.keySet();// it will store all the keys
			 for(String s  : allKeys) 
			 {
				 System.out.println("Key name is "+s);
				 System.out.println("Value is "+obj.get(s));
				 
			 }
			 }
			 
		}
}
}
