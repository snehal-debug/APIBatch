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

public class TC3_PostRequestVar

{
	public static String returnIdValue;
	@Test
	public void testcase3() throws IOException {
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		String JsonRequestBody = JsonHandle.readJsonData("../JanAPIFrameWorkL/src/test/java/Org/testing/Resources/inputRequestVar.json");
		Random r = new Random();
		Integer idValue = r.nextInt();
		JsonRequestBody=jsonReplacement.assignValue(JsonRequestBody, "id", idValue.toString());
		HTTPMethods http = new HTTPMethods (pr);
		Response resobj = http.PostMethod(JsonRequestBody, "QA_URI1");
		returnIdValue = jsonParsingUsingJsonPath.doParsing("id", resobj);
		
			
		
	}

}
