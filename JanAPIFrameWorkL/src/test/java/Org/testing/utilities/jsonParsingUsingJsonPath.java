package Org.testing.utilities;

import io.restassured.response.Response;
//input parameter -- responseObject and the JSONPath
//purpose of the method -- it will parse from the res based upon the jsonpath
//output parameter -- after extracting the value it will return

public class jsonParsingUsingJsonPath {

	public static String doParsing(String jsonPath,Response res) 
	{
		String extractedValue = res.jsonPath().getString(jsonPath);
		return extractedValue;
	}
	
}
