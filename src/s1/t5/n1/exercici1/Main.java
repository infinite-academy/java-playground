package s1.t5.n1.exercici1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();
        scanner.close();

        try {
            listDirContents(dirPath);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public static void listDirContents(String dirPath) throws IOException {
        File dir = new File(dirPath);

        if (!dir.isDirectory()) {
            throw new IOException("Invalid directory path.");
        }

        File[] files = dir.listFiles();
        if (files == null) {
            throw new IOException("Error listing directory contents.");
        }

        Arrays.sort(files); // Sort the files alphabetically

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
