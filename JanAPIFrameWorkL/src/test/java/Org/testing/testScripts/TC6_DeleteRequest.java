package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.PropertiesHandle;

public class TC6_DeleteRequest {
@Test
public void testcase6() throws IOException {
		
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		HTTPMethods http = new HTTPMethods (pr);
		//http.GetAllRequest("QA_URI1");
		http.DeleteParticular("QA_URI1", TC3_PostRequestVar.returnIdValue);
	}
	

	
}
