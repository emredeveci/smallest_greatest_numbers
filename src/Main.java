import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations and declarations
        int input, smallest = Integer.MAX_VALUE, greatest = Integer.MIN_VALUE, numberCount;

        //scanner initialization and user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        numberCount = scanner.nextInt();

        //ask the user for numbers
        //calculate the lowest and highest numbers after each entry
        for ( int i = 1; i <= numberCount; i++) {
            System.out.print("Enter number " + i + " ");
            input = scanner.nextInt();
            smallest = (smallest < input) ? smallest : input;
            greatest = (greatest > input) ? greatest : input;
        }

        //print the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The greatest number is: " + greatest);
    }
}