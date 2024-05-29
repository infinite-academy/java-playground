package s1.t8.n1.exercici7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsByLengthDescending {

    public static void main(String[] args) {
        // Create a list with numbers and strings
        List<Object> mixedList = new ArrayList<>();
        mixedList.add(10);
        mixedList.add("Hello");
        mixedList.add(5);
        mixedList.add("World!");
        mixedList.add("Test");

        // Sort the list by string length (descending)
        Collections.sort(mixedList, (a, b) -> {
            if (a instanceof String && b instanceof String) {
                // Compare lengths in reverse order for descending sort
                return Integer.compare(((String) b).length(), ((String) a).length());
            }
            return 0; // Keep the order for non-string elements
        });

        // Print the sorted list
        System.out.println("Sorted list (descending): " + mixedList);
    }
}