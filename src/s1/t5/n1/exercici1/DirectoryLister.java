package s1.t5.n1.exercici1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryLister {
    private static void printFileNames(File[] files) {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public static String promptForPath(Scanner scanner) {
        System.out.print("enter the path(enter to confirm): ");
        return scanner.nextLine();
    }

    public static void listDirContents(String dirPath) throws IOException {
        File dir = new File(dirPath);
        validateDirectory(dir);

        File[] files = getSortedFiles(dir);

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");
        printFileNames(files);
    }

    protected static void validateDirectory(File dir) throws IOException {
        if (!dir.isDirectory()) {
            throw new IOException("Invalid directory path.");
        }

        File[] files = dir.listFiles();
        if (files == null) {
            throw new IOException("Error listing directory contents.");
        }
    }

    protected static File[] getSortedFiles(File dir) {
        File[] files = dir.listFiles();
        File[] sortedFiles = Arrays.copyOf(files, files.length);
        Arrays.sort(sortedFiles);
        return sortedFiles;
    }

}
