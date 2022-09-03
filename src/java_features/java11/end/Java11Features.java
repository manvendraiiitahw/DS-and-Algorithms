package java_features.java11.end;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11Features {
    public static void main(String[] args) throws IOException {
        Java11Features.writeString("My Name is Manvendra");
        System.out.println(Java11Features.readString(new File("example.txt")));
    }

    public static void writeString(String fileContent) throws IOException {

        Files.writeString(Paths.get("example.txt"), fileContent, StandardOpenOption.CREATE);

    }

    public static String readString(File file) throws IOException {

        return Files.readString(file.toPath());
    }
}
