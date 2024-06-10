package s1.t6.n1.exercici2;

public class GenericMethods {
    public static <T, S, U> void printArguments(T arg1, S arg2, U arg3) {
        System.out.println("Argument 1: " + arg1);
        System.out.println("Argument 2: " + arg2);
        System.out.println("Argument 3: " + arg3);
    }
}