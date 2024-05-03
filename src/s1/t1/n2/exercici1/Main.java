package s1.t1.n2.exercici1;

public class Main {
    void main(String[] args) {
        Smartphone nothing = new Smartphone("Nothing", "Phone 1");
        nothing.trucar("0612345678");
        nothing.fotografiar();
        nothing.alarma();
    }
}

interface Camera {
    void fotografiar();
}

interface Rellotge {
    void alarma();
}

class Telefon {
    String marca = "";
    String model = "";

    Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    void trucar(String tel){
        System.out.println("Calling the number " + tel);
    }
}

class Smartphone extends Telefon implements Camera, Rellotge {

    Smartphone(String marca, String model){
        super(marca, model);
    }


    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}