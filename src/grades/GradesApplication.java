package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Object> students = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String userInput;
        String userYesOrNo;

        Student james = new Student("James T. Kirk");
        james.addGrade(52);
        james.addGrade(85);
        james.addGrade(67);

        Student ivan = new Student("Ivan Sokolov");
        ivan.addGrade(76);
        ivan.addGrade(81);
        ivan.addGrade(79);

        Student robbie = new Student("Robbie Rotten");
        robbie.addGrade(47);
        robbie.addGrade(36);
        robbie.addGrade(99);

        Student abraham = new Student("Abraham Lincoln");
        abraham.addGrade(100);
        abraham.addGrade(98);
        abraham.addGrade(96);

        students.put("VagaJamesBond", james.getName());
        students.put("cheekibreeki", ivan.getName());
        students.put("numberOne", robbie.getName());
        students.put("MrPOTUS16", abraham.getName());

        do {
            System.out.println("Welcome!\n");
            System.out.println("Here are the GitHub usernames of our students:\n");

            for (String username : students.keySet()) {
                System.out.printf("|%s| ", username);
            }

            System.out.println("\n\nWhat student would you like to see more information on?\n");
            userInput = scan.nextLine();

            switch (userInput) {
                case "VagaJamesBond":
                    System.out.printf("\nName: %s - GitHub username: %s%n", james.getName(), userInput);
                    System.out.println("Current Average: " + james.getAverage());
                    break;
                case "cheekibreeki":
                    System.out.printf("\nName: %s - GitHub username: %s%n", ivan.getName(), userInput);
                    System.out.println("Current Average: " + ivan.getAverage());
                    break;
                case "numberOne":
                    System.out.printf("\nName: %s - GitHub username: %s%n", robbie.getName(), userInput);
                    System.out.println("Current Average: " + robbie.getAverage());
                    break;
                case "MrPOTUS16":
                    System.out.printf("\nName: %s - GitHub username: %s%n", abraham.getName(), userInput);
                    System.out.println("Current Average: " + abraham.getAverage());
                    break;
                default:
                    System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".%n", userInput);
                    break;
            }

            System.out.println("\nWould you like to see another student? (Y/N)\n");
            userYesOrNo = scan.nextLine();

            if (userYesOrNo.equalsIgnoreCase("n")) {
                System.out.println("\nGoodbye, and have a nice day!");
            }
        } while (userYesOrNo.equalsIgnoreCase("y"));
    }
}
