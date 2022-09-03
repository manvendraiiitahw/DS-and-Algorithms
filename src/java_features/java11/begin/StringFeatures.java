package java_features.java11.begin;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringFeatures {

	public static boolean isBlank(String value) {
		return value.trim().length() == 0;
	}
	
	public static String strip(String value) {
		return value.trim();
	}
	
	public static String stripLeading(String value) {
		return value.replaceFirst("^\\s*", "");
	}
	
	public static String stripTrailing(String value) {
		return value.replaceFirst("\\s++$", "");
	}

	public static String repeat(String value, int times) {
		
		var result = "";

		for(int x = 0; x < times; x++) {
			result += value;
		}
		
		return result;
	}
	
	public static Stream<String> lines(String value){
		return Arrays.stream(value.split("\n"));
	}
	
}
