package s1.t2.n1.exercici1;

import java.util.ArrayList;


interface VendaDef {
    float calcularTotal() throws VendaBuidaException;
    float getTotal();
    boolean addProducte(Producte p);
    Producte getProducte(int index);
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

    public boolean addProducte(Producte p) {
        return productes.add(p);
    }

    public Producte getProducte(int index) {
        return productes.get(index);
    }

}
