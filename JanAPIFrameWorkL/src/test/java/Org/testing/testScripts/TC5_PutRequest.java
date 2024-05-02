package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.PropertiesHandle;
import Org.testing.utilities.jsonParsingUsingJsonPath;
import Org.testing.utilities.jsonReplacement;
import io.restassured.response.Response;

public class TC5_PutRequest {

	@Test
	public void testcase5() throws IOException {
		
		{
	
			
				Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
				String JsonRequestBody = JsonHandle.readJsonData("../JanAPIFrameWorkL/src/test/java/Org/testing/Resources/inputRequestForUpdate.json");
				
				JsonRequestBody=jsonReplacement.assignValue(JsonRequestBody, "id",TC3_PostRequestVar.returnIdValue);
				HTTPMethods http = new HTTPMethods (pr);
				Response resobj =http.Put(JsonRequestBody, "QA_URI1", TC3_PostRequestVar.returnIdValue);
				
				
					
				
			}

		
	}
}
