package s1.t5.n1.exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import s1.t5.n1.exercici4.DirectoryUtils;

public class FileUtils extends DirectoryUtils {
    public static void serializeObjectToFile(Serializable object, String filePath) throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream(filePath + ".ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);) {
            out.writeObject(object);
            System.out.println("Object has been successfully serialized to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing object to file.");
        }
    }

    public static Serializable deserializeObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        Serializable object = null;
        try (FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream in = new ObjectInputStream(fileIn);) {
            object = (Serializable) in.readObject();
        } catch (ClassCastException exception) {
            System.err.println("Couldn't find the class");
        } catch (IOException exception) {
            System.err.println("Error writing object to file");
        }
        return object;
    }
}