package s1.t6.n1.exercici1;

public class NoGenericMethods {
    private Object obj1;
    private Object obj2;
    private Object obj3;

    // Constructor to initialize the three objects, accepting arguments in any order
    public NoGenericMethods(Object obj1, Object obj2, Object obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    // Getters to retrieve the stored objects
    public Object getObj1() {
        return obj1;
    }

    public Object getObj2() {
        return obj2;
    }

    public Object getObj3() {
        return obj3;
    }

    // Setters to modify the stored objects
    public void setObj1(Object obj1) {
        this.obj1 = obj1;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }

    public void setObj3(Object obj3) {
        this.obj3 = obj3;
    }
}