package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.JsonHandle;
import Org.testing.utilities.PropertiesHandle;

public class TC1_PostRequest {

	@Test
	public void testcase1() throws IOException {
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		String JsonRequestBody = JsonHandle.readJsonData("../JanAPIFrameWorkL/src/test/java/Org/testing/Resources/inputRequest.json");
		HTTPMethods http = new HTTPMethods (pr);
		http.PostMethod(JsonRequestBody, "QA_URI1");
		
	}
}
