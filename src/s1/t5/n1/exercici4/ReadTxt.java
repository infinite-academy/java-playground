package s1.t5.n1.exercici4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import s1.t5.n1.exercici3.DirectoryListerToFile;

public class ReadTxt extends DirectoryListerToFile {
    public static void readAndPrintFileContent(String inputFilePath) throws IOException {
        StringBuilder output = new StringBuilder();
        DirectoryListerToFile.listDirContentsRecursively(inputFilePath);
        Files.lines(Paths.get(inputFilePath)).forEach(output::append);
        System.out.println(output.toString());
    }
}