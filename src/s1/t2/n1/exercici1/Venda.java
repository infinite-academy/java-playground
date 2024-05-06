package s1.t2.n1.exercici1;

import java.util.ArrayList;


interface VendaDef {
    float calcularTotal() throws VendaBuidaException;
    float getTotal();
    void addProducte(Producte p);
}

class Venda implements VendaDef {
    private ArrayList<Producte> productes = new ArrayList<>();
    private float total = 0.0f;

    public float calcularTotal() throws VendaBuidaException {
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

    public void addProducte(Producte p) {
        productes.add(p);
    }
    
}
