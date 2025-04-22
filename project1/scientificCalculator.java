import java.util.Scanner;

public class scientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey there! Welcome to my Scientific Calculator!");
        System.out.println("Here's what I can do for you:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("What would you like to calculate? Pick a number (1-9):");

        int choice = scanner.nextInt(); // Reading user choice
        double num1, num2;

        switch (choice) {
            case 1: // Addition
                System.out.println("Enter two numbers to add:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2: // Subtraction
                System.out.println("Enter two numbers to subtract:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3: // Multiplication
                System.out.println("Enter two numbers to multiply:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4: // Division
                System.out.println("Enter two numbers to divide:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Oops, division by zero is not allowed!");
                }
                break;

            case 5: // Square Root
                System.out.println("Enter a number to find its square root:");
                num1 = scanner.nextDouble();
                System.out.println("Result: " + Math.sqrt(num1));
                break;

            case 6: // Power
                System.out.println("Enter the base and the exponent:");
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(num1, num2));
                break;

            default:
                System.out.println("Hmm, that doesn't seem right. Please pick a valid option!");
        }

        System.out.println("Thanks for using the calculator! See you next time!");
        scanner.close(); // Closing the scanner
    }
}