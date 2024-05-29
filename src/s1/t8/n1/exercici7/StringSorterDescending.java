import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorterDescending {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Tom", "Jonathan");

        // Sort the list by string length (descending)
        names.sort(Comparator.comparingInt(String::length).reversed());

        // Print the sorted list
        System.out.println("Strings sorted by length (descending): " + names);
    }
}