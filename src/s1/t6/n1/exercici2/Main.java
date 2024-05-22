package s1.t7.n1.exercici2;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("John", "Doe", 30);

        // Call the generic method with different parameter types and order
        GenericMethods.printArguments(persona, "Hello", 100);
        GenericMethods.printArguments(50, persona, "World");
        GenericMethods.printArguments(3.14, 7, persona);
    }
}