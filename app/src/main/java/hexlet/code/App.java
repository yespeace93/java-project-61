package hexlet.code;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        int numberOfGame = scanner.nextInt();

        System.out.println("Your choice: " + numberOfGame);

        switch (numberOfGame) {
            case 0:
                scanner.close();
                break;
            case 1:
                hexlet.code.Cli.greetUser();
                break;
            case 2:
                hexlet.code.Even.isEven();
                break;
            default:
                System.out.println("Error! Choose a number from 0 to 2.");
        }
    }
}
