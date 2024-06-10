package s1.t5.n1.exercici5;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import s1.t5.n1.exercici1.DirectoryLister;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the filename to serialize obj to (.ser) - ");
            String filename = DirectoryLister.promptForPath(scanner);
            FileUtils.serializeObjectToFile(new MyObject(filename), filename);
            Serializable dFile = FileUtils.deserializeObjectFromFile(filename + ".ser");
            System.out.println(((MyObject) dFile).getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find a class in the file: " + e.getMessage());
        }
    }
}

class MyObject implements Serializable {
    private String message;

    public MyObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}