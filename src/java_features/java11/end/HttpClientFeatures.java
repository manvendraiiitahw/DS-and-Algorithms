package java_features.java11.end;

import java.io.IOException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientFeatures {
	static String s=null;
	public static void main(String[] args) throws Exception {

		System.out.println(s.length());
//		System.out.println(HttpClientFeatures.sendGet());
	}

	public static int sendGet() throws IOException, Exception {

		var client = HttpClient.newHttpClient();
		var url = new URL("https://www.linkedin.com/learning/");
		var request = HttpRequest.newBuilder()
				.GET().uri(url.toURI()).build();
		
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response);
		return response.statusCode();
	}
	
}
