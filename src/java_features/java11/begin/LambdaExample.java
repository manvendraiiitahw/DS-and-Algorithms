package java_features.java11.begin;

import java.util.function.BiFunction;

public class LambdaExample {

	public static String varWithLambda(String value1, String value2) {
		
		BiFunction<String, String, String> lamda = (val1, val2) -> String.join(" ", val1, val2);
		return lamda.apply(value1, value2);
				
	}
}
