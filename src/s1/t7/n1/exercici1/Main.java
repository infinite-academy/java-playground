package s1.t7.n1.exercici1;

public class Main {
        public static void main(String[] args) {
                // Demonstrate that arguments can be passed in any order to the constructor
                NoGenericMethods container1 = new NoGenericMethods("Hello", 123, true);
                NoGenericMethods container2 = new NoGenericMethods(123, true, "Hello");
                NoGenericMethods container3 = new NoGenericMethods(true, "Hello", 123);

                // Print the objects from each container to verify order doesn't matter
                System.out.println(
                                "Container 1: " + container1.getObj1() + ", " + container1.getObj2() + ", "
                                                + container1.getObj3());
                System.out.println(
                                "Container 2: " + container2.getObj1() + ", " + container2.getObj2() + ", "
                                                + container2.getObj3());
                System.out.println(
                                "Container 3: " + container3.getObj1() + ", " + container3.getObj2() + ", "
                                                + container3.getObj3());
        }
}