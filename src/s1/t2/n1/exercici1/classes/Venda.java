package s1.t2.n1.exercici1.classes;

import java.util.ArrayList;

import s1.t2.n1.exercici1.exceptions.VendaBuidaException;
import s1.t2.n1.exercici1.interfaces.VendaInterface;


public class Venda implements VendaInterface {
    private ArrayList<Producte> productes = new ArrayList<>();
    private float total;

    public float calcularTotal() throws VendaBuidaException {
        total = 0.0f;
        if(productes.isEmpty()){
            throw new VendaBuidaException();
        }
        for(Producte p : productes){
            total+= p.getPreu();
        }  
        return total;          
    }

    public float getTotal() {
        return total;
    }

    public boolean addProducte(Producte p) {
        return productes.add(p);
    }

    public Producte getProducte(int index) {
        return productes.get(index);
    }

}
