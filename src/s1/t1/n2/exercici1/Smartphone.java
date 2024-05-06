package s1.t1.n2.exercici1;

class Smartphone extends Telefon implements Utils, Rellotge {

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