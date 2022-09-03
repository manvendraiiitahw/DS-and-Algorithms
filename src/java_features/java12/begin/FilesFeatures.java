package java_features.java12.begin;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesFeatures {

	public static long mistmatch(File file1, File file2) throws IOException {
		
		var file1Contents = Files.readString(Paths.get(file1.getName()), StandardCharsets.UTF_8); 
		var file2Contents = Files.readString(Paths.get(file2.getName()), StandardCharsets.UTF_8); 
	
		for(int x = 0; x < file1Contents.length(); x++) {
			
			if(file1Contents.charAt(x) != file2Contents.charAt(x)) {
				return x;
			}
		}
		
		return -1;
	}
}
