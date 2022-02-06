package pl.kocan.singleton.classes;

import java.util.Scanner;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class GuessGame {

    private static final GuessGame instance = new GuessGame();
    private int score = 0;
    private final Scanner scanner = new Scanner(System.in);

    private GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {

        for (int i = 0; i < 10; i++) {
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

    protected Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }

}
