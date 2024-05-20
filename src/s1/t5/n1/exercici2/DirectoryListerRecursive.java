package s1.t5.n1.exercici2;

import s1.t5.n1.exercici1.DirectoryLister;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DirectoryListerRecursive extends DirectoryLister {
    private static void printFileNames(File[] files, String indent) {
        for (File file : files) {
            System.out.println(indent + (file.isDirectory() ? "D " : "F ") + file.getName());
            if (file.isDirectory()) {
                printFileNames(file.listFiles(), indent + "  ");
            }
        }
    }

    public static void listDirContentsRecursively(String dirPath) throws IOException {
        File dir = new File(dirPath);
        DirectoryLister.validateDirectory(dir);

        File[] files = dir.listFiles();
        Arrays.sort(files); // Sort the files alphabetically

        System.out.println("Contents of " + dir.getAbsolutePath() + ":");
        printFileNames(files, "");

        for (File file : files) {
            if (file.isDirectory()) {
                listDirContentsRecursively(file.getAbsolutePath());
            }
        }
    }
}
