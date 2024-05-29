import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Tom", "Jonathan");

        // Sort the list by string length using a lambda expression
        names.sort(Comparator.comparingInt(String::length));

        // Print the sorted list
        System.out.println("Strings sorted by length (ascending): " + names);
    }
}