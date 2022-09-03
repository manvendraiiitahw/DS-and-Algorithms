package java_features.java12.end;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesFeatures {

	public static long mismatch(File file1, File file2) throws IOException {
		
		return Files.mismatch(file1.toPath(), file2.toPath());
	}
}
