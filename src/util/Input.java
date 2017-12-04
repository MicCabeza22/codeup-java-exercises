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
        String userInput = this.scanner.next();
        int userNumber;

        try {
            userNumber = Integer.valueOf(userInput);
        } catch (Exception e) {
            System.out.println("Error! Type \"int\" expected");
            userNumber = 0;
        }

        return userNumber;
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
        String userInput = this.scanner.next();
        double userNumber;

        try {
            userNumber = Double.valueOf(userInput);
        } catch (Exception e) {
            System.out.println("Error! Type \"double\" expected");
            userNumber = 0;
        }

        return userNumber;
    }
}