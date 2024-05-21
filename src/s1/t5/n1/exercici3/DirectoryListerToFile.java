package s1.t5.n1.exercici3;

import s1.t5.n1.exercici2.DirectoryListerRecursive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryListerToFile extends DirectoryListerRecursive {
    public static void listDirContentsRecursivelyToFile(String dirPath, String outputFilePath) throws IOException {
        StringBuilder output = new StringBuilder();
        DirectoryListerRecursive.listDirContentsRecursively(dirPath);
        Files.write(Paths.get(outputFilePath), output.toString().getBytes());
    }
}