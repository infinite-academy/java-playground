package s1.t1.n1.exercici1;

import java.util.Random;



class Main {
     static void main(String[] args){
        System.out.println("Base class loaded. Checking it's sucess via accessing a static: " + Instrument.Tipus.vent);

        VentInstrument vent = new VentInstrument("Flauta", (new Random().nextFloat()) * 1000);        
        vent.tocar();

        CordaInstrument corda = new CordaInstrument("Guitar", (new Random().nextFloat() ) * 1000);        
        corda.tocar();

        PercusioInstrument percusio = new PercusioInstrument("Tamborin", (new Random().nextFloat()) * 1000);
        percusio.tocar();
    }
}