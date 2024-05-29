import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringsByLength {

    public static void main(String[] args) {
        // Create a list with numbers and strings
        List<Object> mixedList = new ArrayList<>();
        mixedList.add(10);
        mixedList.add("Hello");
        mixedList.add(5);
        mixedList.add("World!");
        mixedList.add("Test");

        // Sort the list by string length (ascending)
        Collections.sort(mixedList, (a, b) -> {
            if (a instanceof String && b instanceof String) {
                return Integer.compare(((String) a).length(), ((String) b).length());
            } 
            return 0; // Keep the order for non-string elements
        });

        // Print the sorted list
        System.out.println("Sorted list: " + mixedList);
    }
}