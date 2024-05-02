package Org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//input parameter --> we have to give the file path
//purpose of this method --> it can load any properties file
//output parameter -->it will return the object of properties class

public class PropertiesHandle {

	public static Properties loadPropertiesFile(String filePath) throws IOException {
		
		File f = new File(filePath);// create connection
		FileReader fr = new FileReader(f);
		Properties pr = new Properties();//properties class object
		pr.load(fr);
		return pr;
		
	}
}
