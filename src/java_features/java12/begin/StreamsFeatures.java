package java_features.java12.begin;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StreamsFeatures {

	public static String getRange(List<Integer> numbers) {
		

		var min = numbers.stream().collect(Collectors.minBy(Integer::compare));
		var max = numbers.stream().collect(Collectors.maxBy(Integer::compare));
		
		BiFunction<Integer, Integer, String> biFunction = (v1, v2) -> String.format("%s - %s", v1, v2);

		return biFunction.apply(min.get(), max.get());
		
	}
	
}
