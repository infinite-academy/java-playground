package s1.t8.n1.exercici4;

import java.util.Arrays;
import java.util.List;

public class PrintMonths {

    public static void main(String[] args) {
        // Create a list of months
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        // Print each month using a method reference
        System.out.println("Months of the year:");
        months.forEach(System.out::println);
    }
}