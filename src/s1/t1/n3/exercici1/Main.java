package javaPlayground.src.s1.t1.n3.exercici1;

public class Main {
    
}

class Noticia {
    static enum classificades {
        futbol,
        básquet,
        tenis, 
        F1,
        motociclisme
    }

    String titular = "";
    String text = "";
    String data = "";
    int pontuacio = 0;
    float preu = 0.0f;

    Noticia(String titular, String text, String data, int pontuacio, float preu) {
        this.text = text;
    }
}

class Redactor {
    String nom = "";
    // Note: To assign final fields at construction time, do not assign at time of init.
    final String dni;
    static float sou = 1500.0f;

    Redactor(String nom, String dni, float sou) {
        this.nom = nom;
        this.dni = dni;
    }

}

// TODO: Refactor t1 to use least privilege access and also improve your finals