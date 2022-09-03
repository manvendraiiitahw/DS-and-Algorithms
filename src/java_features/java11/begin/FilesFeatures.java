package java_features.java11.begin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesFeatures {

	public static void writeString(String fileContent) throws IOException {
		
		var fileName = "example.txt";
		var writer = new BufferedWriter(new FileWriter(fileName));
		writer.write(fileContent);
		writer.close();
		
	}
	
	public static String readString(File file) throws IOException {

		var reader = new BufferedReader(new FileReader(file));
		
		String line;
		var fileContents = new StringBuilder();
		
		while((line = reader.readLine()) != null) {
			fileContents.append(line).append(System.lineSeparator());
		}
		
		reader.close();
		
		return fileContents.toString().strip();
	}
}
