package s1.t2.n1.exercici1;

import s1.t2.n1.exercici1.classes.Producte;
import s1.t2.n1.exercici1.classes.Venda;
import s1.t2.n1.exercici1.exceptions.VendaBuidaException;

class Main {
    void main (String[] args) {
        Venda v = new Venda();
        // Counter and while exist only to mock and test functionality and run both errors in the same trycatch.
        int counter = 0;
        while (counter < 2) {
            try{
                // First run to try calculating without products
                if(counter == 0) {
                    v.calcularTotal();
                    System.out.println(v.getTotal());
                }
                // Populate venda with products to enable calculations
                for(int i = 0; i < 10; i++){
                    Producte p = new Producte((i + 1)* 10.0f, "producte-test-" + i);
                    v.addProducte(p);
                    System.out.println("Added producte: " + p.nom + " $" + p.getPreu());
                }
                v.getProducte(1);
                v.calcularTotal();
                System.out.println(v.getTotal());
                v.getProducte(-1);
            }catch(VendaBuidaException e){
                System.out.println(e.getMessage());
                counter++;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }    
}
