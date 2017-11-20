import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String question;

        System.out.println("Ask Bob a question:");
        question = scan.nextLine();

        if (question.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (question.endsWith("!")){
            System.out.println("Bob: Whoa, chill out!");
        } else if (question.equals("")) {
            System.out.println("Fine. Be that way!");
        } else if ((question.endsWith(".") || (question.endsWith("")))) {
            System.out.println("Bob: Whatever.");
        }
    }
}