package s1.t8.n1.exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice", "Tom");

        // Filter the list using the helper method
        List<String> filteredNames = filterStringsWithO(names);

        // Print the filtered list
        System.out.println("Strings containing 'o': " + filteredNames);
    }

    // Reusable method for filtering strings with 'o'
    public static List<String> filterStringsWithO(List<String> list) {
        return list.stream()
                .filter(name -> name.toLowerCase().contains("o"))
                .collect(Collectors.toList());
    }
}