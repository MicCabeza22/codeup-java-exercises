import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numericalGrade;
        char letterGrade;
        String choice;

        do {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            numericalGrade = scan.nextInt();

            while (numericalGrade < 0 || numericalGrade > 100) {
                System.out.print("Enter a numerical grade from 0 to 100: ");
                numericalGrade = scan.nextInt();
            }

            if (numericalGrade > 87) {
                letterGrade = 'A';
                System.out.println("The letter grade is: " + letterGrade);
            } else if (numericalGrade > 79) {
                letterGrade = 'B';
                System.out.println("The letter grade is: " + letterGrade);
            } else if (numericalGrade > 66) {
                letterGrade = 'C';
                System.out.println("The letter grade is: " + letterGrade);
            } else if (numericalGrade > 59) {
                letterGrade = 'D';
                System.out.println("The letter grade is: " + letterGrade);
            } else {
                letterGrade = 'F';
                System.out.println("The letter grade is: " + letterGrade);
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