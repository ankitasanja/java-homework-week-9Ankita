package calculate;

import java.util.Scanner;

/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

public class Main {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        boolean result = true;

        while (result) {
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N' : ");
            char ch = scanner.next().charAt(0);
            switch (ch) {

                case 'Y':
                case 'y':

                    System.out.println("Enter first number: ");
                    int firstNumber = scanner.nextInt();
                    System.out.println("Enter second number: ");
                    int secondNumber = scanner.nextInt();
                    System.out.println("Please enter one of symbol +, -, *, /: ");
                    char symbol = scanner.next().charAt(0);
                    Calculator.calculateResult(firstNumber, secondNumber, symbol);
                    break;

                case 'N':
                case 'n':

                    result = false;
                    break;
            }
        }
        //Closing the scanner object
        scanner.close();
    }
}
