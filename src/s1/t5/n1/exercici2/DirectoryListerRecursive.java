package s1.t5.n1.exercici2;

import s1.t5.n1.exercici1.DirectoryLister;

import java.io.File;
import java.io.IOException;

public class DirectoryListerRecursive extends DirectoryLister {
    private static void printFileNames(File dir, File[] files, String indent) {
        System.out.println("Contents of " + dir.getAbsolutePath() + ":");
        for (File file : files) {
            System.out.println(indent + (file.isDirectory() ? "D " : "F ") + file.getName());
            if (file.isDirectory()) {
                printFileNames(dir, file.listFiles(), indent + "  ");
            }
        }
    }

    public static void listDirContentsRecursively(String dirPath) throws IOException {
        File dir = new File(dirPath);
        DirectoryLister.validateDirectory(dir);

        File[] files = DirectoryLister.getSortedFiles(dir);
        printFileNames(dir, files, " ");

        for (File file : files) {
            if (file.isDirectory()) {
                listDirContentsRecursively(file.getAbsolutePath());
            }
        }
    }
}
