package s1.t2.n1.exercici1;


class VendaBuidaException extends Exception {
    VendaBuidaException (){
        super("Per fer una venda primer has d'afegir productes");
    }
}