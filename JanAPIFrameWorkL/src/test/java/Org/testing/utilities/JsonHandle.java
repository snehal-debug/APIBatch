package Org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

//input parameter --- JsonFilePath
//Purpose of this method -- read the json data
//output parameter--- json data in string form

public class JsonHandle {
	
	public static String readJsonData(String filePath) throws FileNotFoundException 
	{
		File f = new File(filePath);//connection establish
		FileInputStream fi = new FileInputStream(f);//stream obj
		JSONTokener js = new JSONTokener(fi);// tokener object
		JSONObject j = new JSONObject(js);// jsonobject object
		return j.toString();
		
		
	}

}
