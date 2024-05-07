package s1.t1.n2.exercici1;

class Telefon {
    String marca = "";
    String model = "";

    Telefon(String marca, String model){
        this.marca = marca;
        this.model = model;
    }

    void trucar(String tel){
        System.out.println("Calling the number " + tel);
    }
}
