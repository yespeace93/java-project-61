package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
