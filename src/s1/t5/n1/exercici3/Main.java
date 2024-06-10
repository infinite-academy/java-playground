package s1.t5.n1.exercici3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Directory to ls - ");
            String dirPath = DirectoryListerToFile.promptForPath(scanner);
            System.out.print("Output file -");
            String outputFilePath = DirectoryListerToFile.promptForPath(scanner);
            DirectoryListerToFile.listDirContentsRecursivelyToFile(dirPath, outputFilePath);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
