package Org.testing.testScripts;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingUsingJsonPath {

 public static void main(String[] args) {
	
		
		{
			Response res =
					given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudents");
			 System.out.println(res.asString());
			 String desig= res.jsonPath().get("[2].Designation");
			 System.out.println("Designation is" + desig);
		}
}
}
		
