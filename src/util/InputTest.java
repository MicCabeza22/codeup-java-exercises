package util;

public class InputTest {
    public static void main(String[] args) {
        Input in = new Input();

//        System.out.println("How are you feeling?");
//        String userFeeling = in.getString();
//
//        System.out.println("Okay. You are feeling " + userFeeling + ".");
//
//        System.out.println("Are you awake? [y/n]");
//        boolean userIsAwake = in.yesNo();
//
//        if (userIsAwake) {
//            System.out.println("User is awake.");
//        } else {
//            System.out.println("User is asleep.");
//        }

//        System.out.println("Enter an integer: ");
//        int userInput = in.getInt();
//        System.out.println("Integer is: " + userInput + ".");

//        System.out.println("Enter an integer between 1 and 10: ");
//        int userInput = in.getInt(1, 10);
//        System.out.println("Integer is: " + userInput + ".");

        System.out.println("Enter a number:");
        double userInput = in.getDouble();
        System.out.println("Number is: " + userInput + ".");

//        System.out.println("Please enter a number between 0 and 1: ");
//        double userInput = in.getDouble(0, 1);
//        System.out.println("Number is: " + userInput + ".");
    }
}
