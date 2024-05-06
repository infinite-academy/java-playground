package s1.t1.n3.exercici1;

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
    };

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