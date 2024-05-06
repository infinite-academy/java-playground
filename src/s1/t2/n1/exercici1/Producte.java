package s1.t2.n1.exercici1;

class Producte {
    private float preu = 0.0f;
    String nom = "";


    Producte(float preu, String nom) {
        this.preu = preu;
        this.nom = nom;
    }

    float getPreu () {
        return preu;
    }
}
