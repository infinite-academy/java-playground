package javaPlayground.src.s1.t1.n1.exercici2;

public class Main {
    void main(String[] args) {
        Cotxe car = new Cotxe("Camaro"); 
        System.out.println("Su potencia es:" + car.potencia);

        car.accelerar();
        Cotxe.frenar();
    }
        
}

class Cotxe {
    static final String marca = "Ford";
    static String model = "Mustang";
    final int potencia = 250;       

    static {
        System.out.printf("Base cotxe cargado en memoria. Defaults: Marca: %s, Model: %s\n", Cotxe.marca, Cotxe.model);
    }

    Cotxe(String model){
        Cotxe.model = model;
        System.out.println("Model: " + Cotxe.model);
    }


    static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
