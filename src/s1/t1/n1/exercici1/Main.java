package javaPlayground.src.s1.t1.n1.exercici1;

interface instrument{
    void tocar();
}

class Instrument implements instrument {
    static enum Tipus {
        vent,
        corda,
        percussió
    }


    Instrument(String tipus, String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
        this.tipus = tipus;
        System.out.printf("Instrument creat: %s, tipus %s, preu %f", nom, tipus, preu);
    }

    protected String nom = "";
    protected String tipus = "";
    protected float preu = 0.0f;

    public void tocar() {
        System.out.println("Està sonant un instrument de " + tipus);
    }
}



public class Main {
    public static void main(String[] args){
        Instrument flauta = new Instrument("vent", "flauta", 100);
        System.out.println(flauta.nom);
        flauta.tocar();
    }
}
