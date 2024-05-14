package s1.t1.n1.exercici1;


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