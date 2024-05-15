package s1.t5.n1.exercici3;

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
        Arrays.sort(files); // Sort the files alphabetically (Case sensitive)

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");

        for (File file : files) {
            if (file.isDirectory()) {
                if (file.listFiles().length > 0) {
                    System.out.println("D " + file.getName() + " (with contents)");
                    listDirContents(file.getAbsolutePath());
                } else {
                    System.out.println("D " + file.getName() + " (empty)");
                }
            } else {
                System.out.println("F " + file.getName());
            }
        }
    }
}
