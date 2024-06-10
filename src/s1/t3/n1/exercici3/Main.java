package s1.t3.n1.exercici3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CountriesAndCapitalsQAGame game = new CountriesAndCapitalsQAGame();
        try{
            game.startGame();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
