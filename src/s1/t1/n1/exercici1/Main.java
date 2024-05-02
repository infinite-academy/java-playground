package javaPlayground.src.s1.t1.n1.exercici1;

import java.util.Random;



public class Main {
    public static void main(String[] args){
        for (Tipus tipus : Tipus.values()) {
            // Gnrate a random float between 1.0f and 1000.0f
            float preu = (new Random().nextFloat() + 1) * 1000;
            String nom = "Instrument" + tipus.toString();

            Instrument instrumentInstance = new Instrument(tipus.toString(), nom , preu);
            instrumentInstance.tocar();
        }
    }
}

// If i use this interface it breaks the code. Why? 
// interface Instrument{
//     void tocar();
// }

enum Tipus {
    vent,
    corda,
    percussió
}

class Instrument {
    

    Instrument(String tipus, String nom, float preu) {
        this.nom = nom;
        this.preu = preu;
        this.tipus = Tipus.valueOf(tipus).toString();
        System.out.printf("Instrument creat: %s, tipus %s, preu %.2f.\n", nom, tipus, preu);
    }

    @SuppressWarnings("unused")
    private String nom = "";
    private String tipus = "";
    @SuppressWarnings("unused")
    private float preu = 0.0f;

    public void tocar() {
        System.out.printf("Està sonant un instrument de %s. \n", tipus);
    }
}