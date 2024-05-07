package s1.t1.n1.exercici2;


class Cotxe {
    protected static final String MARCA = "Ford";
    protected static String model = "Mustang";
    protected final int potencia;       

    static {
        System.out.printf("Base cotxe cargado en memoria. Defaults: Marca: %s, Model: %s\n", Cotxe.MARCA, Cotxe.model);
    }

    Cotxe(String model, int potencia){
        this.potencia = potencia;
        Cotxe.model = model;
        System.out.println("Ford Cotxe created - Model: " + Cotxe.model + ", Potencia: " + potencia);
    }


    protected static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    protected void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
