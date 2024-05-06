package s1.t1.n1.exercici1;

import java.util.Random;



public class InstrumentTest {
    public static void main(String[] args){
        System.out.println("Assert that instrument is loaded via static accessor(loaded) before instantiating: " + Instrument.loaded);

        VentInstrument vent = new VentInstrument("Flauta", (new Random().nextFloat() + 1) * 1000);        
        vent.tocar();

        CordaInstrument corda = new CordaInstrument("Guitar", (new Random().nextFloat() + 1) * 1000);        
        corda.tocar();

        PercusioInstrument percusio = new PercusioInstrument("Tamborin", (new Random().nextFloat() + 1) * 1000);
        percusio.tocar();
    }
}

// If i use this interface it breaks the code. Why? 
// interface Instrument{
//     void tocar();
// }



class Instrument {
    // Loaded is being used because using enums to 
    static boolean loaded = false;

    static {
        // Because it will only be loaded once, this will only be printed once. 
        System.out.println("Instrument loaded.");
        loaded = true;
    }

    static enum Tipus {
        vent,
        corda,
        percussió
    }

    

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

class VentInstrument extends Instrument {
    VentInstrument(String nom, float preu) {
        super(Tipus.vent.toString(), nom, preu);
    }
}

class CordaInstrument extends Instrument {
    CordaInstrument(String nom, float preu) {
        super(Tipus.corda.toString(), nom, preu);
    }
}
class PercusioInstrument extends Instrument {
    PercusioInstrument(String nom, float preu) {
        super(Tipus.percussió.toString(), nom, preu);
    }
}