package s1.t2.n1.exercici1;

class Main {
    void main (String[] args) {
        Venda v = new Venda();
        try{
            v.calcularTotal();
            System.out.println(v.getTotal());
        }catch(VendaBuidaException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }    
}
