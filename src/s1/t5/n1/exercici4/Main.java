package s1.t5.n1.exercici4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Directory to ls - ");
            String file = DirectoryUtils.promptForPath(scanner);
            DirectoryUtils.readAndPrintFileContent(file);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
