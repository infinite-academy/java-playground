package javaPlayground.src.s1.t1.n1.exercici2;

public class Main {
    void main(String[] args) {
        Cotxe car = new Cotxe("Camaro", 300); 
        car.accelerar();
        Cotxe.frenar();
    }
        
}

class Cotxe {
    static final String MARCA = "Ford";
    static String model = "Mustang";
    final int potencia;       

    static {
        System.out.printf("Base cotxe cargado en memoria. Defaults: Marca: %s, Model: %s\n", Cotxe.MARCA, Cotxe.model);
    }

    Cotxe(String model, int potencia){
        this.potencia = potencia;
        Cotxe.model = model;
        System.out.println("Ford Cotxe created - Model: " + Cotxe.model + ", Potencia: " + potencia);
    }


    static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
