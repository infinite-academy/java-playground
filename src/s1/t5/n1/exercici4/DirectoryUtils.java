package s1.t5.n1.exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import s1.t5.n1.exercici3.DirectoryListerToFile;

public class DirectoryUtils extends DirectoryListerToFile {
    public static void readAndPrintFileContent(String inputFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}