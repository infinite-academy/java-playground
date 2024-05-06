package s1.t1.n3.exercici1;

class Redacio {
    
}
class Redactor {
    String nom = "";
    // Note: To assign final fields at construction time, do not assign at time of init.
    final String dni;
    static float sou = 1500.0f;
    final Noticia[] Noticias = {};

    Redactor(String nom, String dni, float sou) {
        this.nom = nom;
        this.dni = dni;
    }

}

// TODO: Refactor t1 to use least privilege access