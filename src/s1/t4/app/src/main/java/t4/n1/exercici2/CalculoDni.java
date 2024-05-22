package t4.n1.exercici2;

public class CalculoDni {
    private final String dni;
    CalculoDni(String dni){
        this.dni = dni;
    }

    char calcularLetra(int index){
        return dni.charAt(index);
    }
}
