package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.PropertiesHandle;
import Org.testing.utilities.jsonParsingUsingJsonPath;
import Org.testing.utilities.jsonReplacement;
import io.restassured.response.Response;

public class TC7_RealTimePostRequest {
	public static String returnIdValue;
	@Test
	public void testcase7() throws IOException {
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		String JsonRequestBody = JsonHandle.readJsonData("../JanAPIFrameWorkL/src/test/java/Org/testing/Resources/inputRequestReal.json");
		//JsonRequestBody=jsonReplacement.assignValue(JsonRequestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods (pr);
		//http.PostMethod(JsonRequestBody, "Real_Time_Post");
		Response resobj = http.PostMethod(JsonRequestBody, "Real_Time_Post");
		//Response resobj = http.PostMethod(JsonRequestBody, "Real_Time_Post");
		returnIdValue = jsonParsingUsingJsonPath.doParsing("id", resobj);
		System.out.println(resobj);
		
		
		
	}
}
