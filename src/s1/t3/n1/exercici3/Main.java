package s1.t3.n1.exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {
    void main(String[] args) {
        try {
            HashMap<String, String> countriesAndCapitals = new HashMap<String, String>();
            // Get the current working directory, for your convenience.
            System.out.println(System.getProperty("user.dir"));
            // Create a File object for the text file
            File file = new File("./src/s1/t3/n1/exercici3/resources/countries.txt");
            // Create a Scanner object for the file
            Scanner scanner = new Scanner(file);
            // Read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] countryAndCapital = line.split("\\s");
                // No matches
                if(countryAndCapital.length < 2) break;
                countriesAndCapitals.put(countryAndCapital[0], countryAndCapital[1]);
                System.out.println(line);
            }
            // Close the file scanner
            scanner.close();
            // Create a Scanner object for the console
            scanner = new Scanner(System.in);
            // Prompt the user to enter a string
            System.out.println("Enter a username and hit enter to continue...");
            // Read the string from the console
            String username = scanner.nextLine();  
            // Print the string back to the console
            System.out.println("Hi " + username + "We'll start a game where I'll provide a country and you have to guess the capital. At the end I'll output your score to a file. Capital must be capitalized.");
            System.out.println("Hit enter to continue...");
            Random generator = new Random();
            // Get keys and find a random one. Add it to a Set so we can check if we've tried it before.
            Object[] countries = countriesAndCapitals.keySet().toArray();
            HashSet<String> asked = new HashSet<String>(10);
            int score = 0;
            System.out.println("Here are 10 random countries:");
            for(int i = 0; i < 10; i++){
                Object randomCountry = countries[generator.nextInt(countries.length)];
                // Check if we've asked before.
                if(asked.contains(randomCountry.toString())) {
                    i--;
                    continue;
                }
                asked.add(randomCountry.toString());
                System.out.println("Capital of " + randomCountry + "?");
                // Get the capital for the random country and compare to answer.
                String answer = scanner.nextLine();
                String capital = countriesAndCapitals.get(randomCountry);
                if(answer.equals(capital)){
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            }
            System.out.println("Good try " + username + " your score is " + score + " out of 10.");
            scanner.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter("./src/s1/t3/n1/exercici3/classificacio.txt", true));
            writer.write(username + " " + score + " " + asked.toString());
            writer.newLine();
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
