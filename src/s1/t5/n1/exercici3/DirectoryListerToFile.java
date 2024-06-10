package s1.t5.n1.exercici3;

import s1.t5.n1.exercici1.DirectoryLister;
import s1.t5.n1.exercici2.DirectoryListerRecursive;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryListerToFile extends DirectoryListerRecursive {
    public static void listDirContentsRecursivelyToFile(String dirPath, String outputFilePath) throws IOException {
        StringBuilder output = new StringBuilder();
        listDirContentsRecursively(dirPath, output);
        Files.write(Paths.get(outputFilePath), output.toString().getBytes());
    }

    public static void listDirContentsRecursively(String dirPath, StringBuilder output) throws IOException {
        File dir = new File(dirPath);
        DirectoryLister.validateDirectory(dir);

        File[] files = DirectoryLister.getSortedFiles(dir);
        appendContents(output, dir, files, " ");

        for (File file : files) {
            if (file.isDirectory()) {
                listDirContentsRecursively(file.getAbsolutePath(), output);
            }
        }
    }

    public static void appendContents(StringBuilder output, File dir, File[] files, String indent) {
        output.append("Contents of " + dir.getAbsolutePath() + ":" + "\n");
        for (File file : files) {
            output.append(indent + (file.isDirectory() ? "D " : "F ") + file.getName() + "\n");
            if (file.isDirectory()) {
                appendContents(output, dir, file.listFiles(), indent + "  ");
            }
        }
    }

}