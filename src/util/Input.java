package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userChoice = scanner.next();
        return userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else  {
            System.out.println("Not in range.");
            return getInt();
        }
    }

    public int getInt() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Please enter an integer: ");
            scanner.next();
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userInput = getDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else  {
            System.out.println("Not in range.");
            return getDouble();
        }
    }

    public double getDouble() {
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Please enter an integer: ");
            scanner.next();
            return getDouble();
        }    }
}