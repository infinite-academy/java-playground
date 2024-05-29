public class PiCalculator {

    // Define the functional interface
    interface PiValueGetter {
        double getPiValue();
    }

    public static void main(String[] args) {
        // Create an instance of the functional interface using a lambda
        PiValueGetter piGetter = () -> 3.1415;

        // Get and print the Pi value
        double pi = piGetter.getPiValue();
        System.out.println("The value of Pi is: " + pi);
    }
}