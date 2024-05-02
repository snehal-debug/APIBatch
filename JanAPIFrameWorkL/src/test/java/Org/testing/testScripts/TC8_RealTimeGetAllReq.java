package Org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testSteps.HTTPMethods;
import Org.testing.utilities.PropertiesHandle;

public class TC8_RealTimeGetAllReq {
@Test	
public void testcase8() throws IOException {
		
		Properties pr= PropertiesHandle .loadPropertiesFile("../JanAPIFrameWorkL/URI.properties");
		HTTPMethods http = new HTTPMethods (pr);
		http.GetAllRequest("Real_Time_GetAll");
	}
	

}
