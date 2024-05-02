package Org.testing.utilities;

import java.util.regex.Pattern;
//input parameter --> the complete data,variable name,variable value
//purpose of this method --> to assign the value to a variable in the data
//output parameter --> after assigning it will return the updated value

public class jsonReplacement {
	
	public static String assignValue(String body,String variableName, String variableValue ) 
	{
		body = body.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return body;
		
	}

}
