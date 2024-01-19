package workingwithfilesanddirectories.copyingfileswiththepath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {

    public static void main(String[] args) {

        Path source = Paths.get("C:\\Users\\Sedat Yurt\\Desktop\\example.txt");
        Path dest = Paths.get("C:\\Users\\Sedat Yurt\\Desktop\\new.txt");

        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
