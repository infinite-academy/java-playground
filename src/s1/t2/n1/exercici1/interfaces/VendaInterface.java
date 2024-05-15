package s1.t2.n1.exercici1.interfaces;

import s1.t2.n1.exercici1.exceptions.VendaBuidaException;
import s1.t2.n1.exercici1.classes.Producte;


public interface VendaInterface {
    float calcularTotal() throws VendaBuidaException;
    float getTotal();
    boolean addProducte(Producte p);
    Producte getProducte(int index);
}
