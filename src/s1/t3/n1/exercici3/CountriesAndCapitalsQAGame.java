package s1.t3.n1.exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class CountriesAndCapitalsQAGame {
    private final HashMap<String, String> countriesAndCapitals;
    private final Random random;
    String username;

    public CountriesAndCapitalsQAGame() {

        this.countriesAndCapitals = new HashMap<>();
        this.random = new Random();
    }

    public void startGame() throws FileNotFoundException, IOException {
        loadGame(countriesAndCapitals);
        playGame();
    }

    private void loadGame(HashMap<String, String> countriesAndCapitals) throws FileNotFoundException {
        try {
            File file = new File("./src/s1/t3/n1/exercici3/resources/countries.txt");
            // Read the file line by line
            try ( // Create a Scanner object for the file
                    Scanner fileScanner = new Scanner(file)) {
                // Read the file line by line
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] countryAndCapital = line.split("\\s");
                    // No matches
                    if (countryAndCapital.length < 2)
                        break;
                    countriesAndCapitals.put(countryAndCapital[0], countryAndCapital[1]);
                }
                // Close the file scanner
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    private void playGame() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;
            int totalQuestions = 10;
            username = promptUsername(scanner);
            HashMap<String, String> countriesAndCapitalsPool = new HashMap<>(countriesAndCapitals);

            System.out.println("Welcome, " + username + "!");
            for (int i = 0; i < totalQuestions; i++) {
                String country = getRandomCountryFromPool(countriesAndCapitalsPool);
                String correctCapital = countriesAndCapitals.get(country);
                String userAnswer = getUserAnswer(scanner, country);

                if (userAnswer.equalsIgnoreCase(correctCapital)) {
                    System.out.println("Correct! The capital of " + country + " is " + correctCapital);
                    score++;
                } else {
                    System.out.println("Incorrect. The capital of " + country + " is " + correctCapital);
                }
            }
            System.out.println(username + "Your final score is " + score + " out of " + totalQuestions);
            saveScore(username, score);
        }

    }

    private String getRandomCountryFromPool(HashMap<String, String> map) {
        int randomIndex = this.random.nextInt(map.size());
        String country = (String) map.keySet().toArray()[randomIndex];
        map.remove(country);
        return country;
    }

    private String getUserAnswer(Scanner scanner, String country) {
        System.out.println("What is the capital of " + country + "?");
        return scanner.nextLine();
    }

    private String promptUsername(Scanner scanner) {
        System.out.println("What is your name?");
        username = scanner.nextLine();
        return username;
    }

    private void saveScore(String username, int score) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("./src/s1/t3/n1/exercici3/classificacio.txt", true))) {
            writer.write(username + " " + score);
            writer.newLine();
        }
        System.out.println("Score saved.");
    }
}