package s1.t5.n1.exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String dirPath = scanner.nextLine();
        scanner.close();

        listDirContents(dirPath);
    }

    public static void listDirContents(String dirPath) {
        File dir = new File(dirPath);

        if (!dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        File[] files = dir.listFiles();
        Arrays.sort(files); // Sort the files alphabetically

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
