import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);

//      Get an integer from the user and print it to the console.
        System.out.print("Enter an integer: ");
        userInput = scan.nextInt();
        scan.nextLine();

        System.out.println("Your integer is: " + userInput);

        String firstWord;
        String secondWord;
        String thirdWord;

//      Get three words from a user and print them to the console.
        System.out.print("Enter three words: ");
        firstWord = scan.next();
        secondWord = scan.next();
        thirdWord = scan.next();
        scan.nextLine();

        System.out.println("Your words are: ");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        String sentence;

//      Get a sentence from the user and print it to the console.
        System.out.print("Enter a sentence: ");
        sentence = scan.nextLine();

        System.out.println("Your sentence is: " + sentence);

        double length;
        double width;
        double height;
        double area;
        double perimeter;
        double volume;

//      Calculate the area, perimeter, and volume of a room given the height and width.
        System.out.println("Enter a room's length: ");
        length = scan.nextDouble();
        System.out.println("Enter a room's width: ");
        width = scan.nextDouble();
        System.out.println("Enter a room's height: ");
        height = scan.nextDouble();
        scan.nextLine();

        area = length * width;
        perimeter = 2 * (length + width);
        volume = length * width * height;

        System.out.println("The area of the room is: " + area + " ft^2.");
        System.out.println("The perimeter of the room is: " + perimeter + " ft.");
        System.out.println("The volume of the room is: " + volume + " ft^3.");

        String favoriteQuote;
        int wordCount;

        System.out.println("Enter your favorite quote: ");
        favoriteQuote = scan.nextLine();

        System.out.println("Your favorite quote is: " + favoriteQuote);
        System.out.println("How many words are in the quote?");
        wordCount = scan.nextInt();

        System.out.println("There are " + wordCount + " words in the quote.");
    }
}