import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt;
        String choice;

        do {
            System.out.print("What number would you like to go up to? ");
            userInt = scan.nextInt();

            System.out.println("Here is a table of numbers and their squares and cubes:");
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userInt; i++) {
                System.out.println(i + "      | "
                        + (int) Math.pow(i, 2)
                        + "       | "
                        + (int) Math.pow(i, 3));
            }

            System.out.println("Would you like to continue? (YES/NO)");
            choice = scan.next();

            while (!choice.equals("YES") && !choice.equals("NO")) {
                System.out.println("Would you like to continue? (YES/NO)");
                choice = scan.next();
            }
        } while (choice.equals("YES"));
    }
}