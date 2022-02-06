package pl.kocan.singleton.classes;

import java.util.Scanner;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class GuessGame {

    private static GuessGame instance = new GuessGame();
    private int score = 0;
    private Scanner scanner = new Scanner(System.in);

    GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {

        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(randomNumeric(1));
            System.out.print("Zgadnij cyfre: ");
            int quess = scanner.nextInt();

            if (number == quess) {
                System.out.println("Udalo sie!");
                score++;
            } else {
                System.out.println("Przykro mi, myslalem o " + number);
            }
        }

        System.out.println("Twoj wynik: " + score);

    }

    public int getScore() {
        return Integer.parseInt(randomNumeric(9));
    }

}
