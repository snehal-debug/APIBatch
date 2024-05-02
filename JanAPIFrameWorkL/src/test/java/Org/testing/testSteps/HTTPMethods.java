package Org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {

	Properties pr; // global
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
		
	}
	
	public Response PostMethod(String requestBody,String uriKeyname) 
	{
		String uriValue = pr.getProperty(uriKeyname);
		Response res =
				given().contentType(ContentType.JSON).body(requestBody).when().post(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println(res.asString());
		return res;
		
		
				
	}
	
	public void GetAllRequest(String uriKeyname) 
	{
		String uriValue = pr.getProperty(uriKeyname);
		Response res =
				given().contentType(ContentType.JSON).when().get(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
				
	}
	
	public void GetParticular(String uriKeyname,String endPoint) 
	{
		String uriValue = pr.getProperty(uriKeyname)+"/"+endPoint;
		Response res =
				given().contentType(ContentType.JSON).when().get(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println(uriValue);
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
				
	}
	
	public Response Put(String requestBody,String uriKeyname,String endPointValue) 
	{
		String uriValue = pr.getProperty(uriKeyname)+"/"+endPointValue;
		Response res =
				given().contentType(ContentType.JSON).body(requestBody).when().put(uriValue);
		
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println(uriValue);
		return res;
		
		
				
	}
	
	public void DeleteParticular(String uriKeyname,String endPoint) 
	{
		String uriValue = pr.getProperty(uriKeyname)+"/"+endPoint;
		Response res =
				given().contentType(ContentType.JSON).when().delete(uriValue);
		
		System.out.println("Status code is "+res.statusCode());
		System.out.println(uriValue);
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
				
	}
	
}




