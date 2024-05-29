public class StringReverser {

    // Define the functional interface
    interface StringReverserInterface {
        String reverse(String str);
    }

    public static void main(String[] args) {
        // Implement the interface using a lambda expression
        StringReverserInterface reverser = (str) -> {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };

        // Test the string reverser
        String testString = "Hello, world!";
        String reversedString = reverser.reverse(testString);

        // Print the results
        System.out.println("Original String: " + testString);
        System.out.println("Reversed String: " + reversedString);
    }
}