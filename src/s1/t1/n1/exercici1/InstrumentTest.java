package s1.t1.n1.exercici1;


// If i use this interface it breaks the code. Why? 
interface InstrumentDef{
    void tocar();
}



class Instrument implements InstrumentDef {
    static {
        // Because it will only be loaded once, this will only be printed once. 
        System.out.println("Instrument loaded.");
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

    
    String nom = "";
    String tipus = "";
    float preu = 0.0f;

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