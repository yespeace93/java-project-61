package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void isEven() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int count = 0;

        while (count < 3) {

            int randomNum = (int) (Math.random() * 100);
            String correctAnswer = "";

            if (randomNum % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            System.out.println("Question: " + randomNum);

            String userAnswer = scanner.nextLine();

            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (count == 3) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

        scanner.close();
    }
}
