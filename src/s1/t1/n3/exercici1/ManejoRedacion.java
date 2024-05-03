package s1.t1.n3.exercici1;

public class ManejoRedacion {
    
}

interface NoticiaDef {
    void calcularPreuNoticia(String[] args);
}

class Noticia implements NoticiaDef {
    static enum TipusClassificades {
        futbol,
        básquet,
        tenis, 
        F1,
        motociclisme
    }

    final TipusClassificades tipus;
    final String text;
    String titular = "";
    int pontuacio = 0;
    float preu = 0.0f;

    Noticia(TipusClassificades tipus, String text) {
        this.text = text;
        this.tipus = tipus;
    }

    public void calcularPreuNoticia(String[] args) {
        // TODO Auto-generated method stub
        
    }


    // void calcularPreuNoticia()
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

// TODO: Refactor t1 to use least privilege access and also improve your finals