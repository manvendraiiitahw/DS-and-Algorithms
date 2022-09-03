package java_features.java12.end;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatFeatures {

	public static String getCompactNumberFormat(int i) {
		
		return NumberFormat.getCompactNumberInstance().format(i); 

	}

	public static String getCompactNumberFormat(int i, Locale locale, NumberFormat.Style style) {
		
		return NumberFormat.getCompactNumberInstance(locale, style).format(i); 

	}
}
