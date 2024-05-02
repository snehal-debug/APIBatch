package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.PropertiesHandle;

public class TC11_RealTimeDeleteReq {
@Test	
public void testcase11() throws IOException {
		
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		HTTPMethods http = new HTTPMethods (pr);
		//http.GetAllRequest("QA_URI1");
		http.DeleteParticular("Real_Time_Delete", TC7_RealTimePostRequest.returnIdValue);
	}

}
