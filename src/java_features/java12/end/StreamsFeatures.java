package java_features.java12.end;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class StreamsFeatures {

	public static String getRange(List<Integer> numbers) {

		return numbers.stream().collect(Collectors.teeing(
				minBy(Integer::compare),
				maxBy(Integer::compare),
				(min, max) -> String.format("%s - %s", min.get(), max.get())));
	}
	
}
