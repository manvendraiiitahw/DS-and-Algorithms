package java_features.java11.begin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientFeatures {

	public static int sendGet() throws IOException {

		var url = new URL("https://www.linkedin.com/learning/");
		var connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		
		int statusCode =  connection.getResponseCode();
		
		var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String responseLine;
		var responseBody = new StringBuilder();
		
		while((responseLine = reader.readLine()) != null) {
			responseBody.append(responseLine).append(System.lineSeparator());
		}
		
		System.out.println(responseBody);
		
		connection.disconnect();
		return statusCode;
	}
	
}
