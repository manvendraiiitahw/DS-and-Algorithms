package java_features.java11.end;

import java.util.stream.Stream;

public class StringFeatures {

	public static boolean isBlank(String value) {
		return value.isBlank();
	}
	
	public static String strip(String value) {
		return value.strip();
	}
	
	public static String stripLeading(String value) {
		return value.stripLeading();
	}
	
	public static String stripTrailing(String value) {
		return value.stripTrailing();
	}

	public static String repeat(String value, int times) {
			return value.repeat(times);
	}
	
	public static Stream<String> lines(String value){
		return value.lines(); 
	}
	
}
