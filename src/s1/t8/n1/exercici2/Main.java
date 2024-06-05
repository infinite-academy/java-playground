package s1.t8.n1.exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Tom", "Jonathan");

        // Filter the list using the helper method
        List<String> filteredNames = filterStringsWithOAndLength(names);

        // Print the filtered list
        System.out.println("Strings containing 'o' and longer than 5 characters: " + filteredNames);
    }

    // Reusable method for filtering strings
    public static List<String> filterStringsWithOAndLength(List<String> list) {
        return list.stream()
                .filter(name -> name.toLowerCase().contains("o") && name.length() > 5)
                .collect(Collectors.toList());
    }
}