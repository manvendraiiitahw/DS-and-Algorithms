package java_features.java12.end;

import java.util.function.Function;

public class StringFeatures {

	public static String indent(String value, int indent) {
		return value.indent(indent); 
	}
	
	public static String transform(Function<String,String> transformation, String value) {
		return value.transform(transformation); 
	}
	
}
