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
        FileOutputStream fileOut = new FileOutputStream(filePath + ".ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        try {
            out.writeObject(object);
            System.out.println("Object has been successfully serialized to " + filePath);
        } finally {
            out.close();
            fileOut.close();
        }
    }

    public static Serializable deserializeObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filePath);
        ObjectInputStream in = new ObjectInputStream(fileIn);

        try {
            Serializable object = (Serializable) in.readObject();
            return object;
        } finally {
            in.close();
            fileIn.close();
        }
    }
}