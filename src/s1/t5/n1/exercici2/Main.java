package s1.t5.n1.exercici2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dirPath = DirectoryListerRecursive.promptForDirectoryPath(scanner);
            DirectoryListerRecursive.listDirContentsRecursively(dirPath);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
