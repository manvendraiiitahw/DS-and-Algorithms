package java_features.java11.end;


import org.springframework.lang.NonNull;

import java.util.function.BiFunction;


public class LambdaExample {
	public static void main(String[] args) {
		System.out.println(LambdaExample.varWithLambda("abc","abcd"));
	}

	public static String varWithLambda(String value1, String value2) {

		BiFunction<String, String, String> lamda = (@NonNull var val1, @NonNull var val2) -> String.join(" ", val1, val2);
		return lamda.apply(value1, value2);

	}
}
