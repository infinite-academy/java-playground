package s1.t5.n1.exercici1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String dirPath = promptForDirectoryPath(scanner);
            listDirContents(dirPath);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }

    private static String promptForDirectoryPath(Scanner scanner) {
        System.out.print("Enter the directory path: ");
        return scanner.nextLine();
    }

    public static void listDirContents(String dirPath) throws IOException {
        File dir = new File(dirPath);
        validateDirectory(dir);

        File[] files = dir.listFiles();
        Arrays.sort(files); // Sort the files alphabetically

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");
        printFileNames(files);
    }

    private static void validateDirectory(File dir) throws IOException {
        if (!dir.isDirectory()) {
            throw new IOException("Invalid directory path.");
        }

        File[] files = dir.listFiles();
        if (files == null) {
            throw new IOException("Error listing directory contents.");
        }
    }

    private static void printFileNames(File[] files) {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
