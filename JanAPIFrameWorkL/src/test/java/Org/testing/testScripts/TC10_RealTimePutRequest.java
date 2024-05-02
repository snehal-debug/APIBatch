package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.PropertiesHandle;
import Org.testing.utilities.jsonReplacement;
import io.restassured.response.Response;

public class TC10_RealTimePutRequest {
@Test
public void testcase10() throws IOException {
		
		{
	
			
				Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
				String JsonRequestBody = JsonHandle.readJsonData("../JanAPIFrameWorkL/src/test/java/Org/testing/Resources/inputReqForUpdateReal.json");
				
				JsonRequestBody=jsonReplacement.assignValue(JsonRequestBody, "id",TC7_RealTimePostRequest.returnIdValue);
				HTTPMethods http = new HTTPMethods (pr);
				Response resobj =http.Put(JsonRequestBody, "Real_Time_Update", TC7_RealTimePostRequest.returnIdValue);
				
				
		}	
				
	}

}
