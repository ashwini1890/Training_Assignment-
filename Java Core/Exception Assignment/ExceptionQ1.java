// Write an application that accepts two numbers, divides the first number with the second
//number and display the result. Hint: You need to handle ArithmeticException which is
//thrown when there is an attempt to divide a number by zero.

import java.util.Scanner;

public class ExceptionQ1 {
    public static void main(String[] args) {
        int Total=0;
        try(Scanner scanner =new Scanner(System.in);) {
            System.out.print("Enter first number :");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter second number :");
            int secondNumber = scanner.nextInt();
            Total = firstNumber/secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("error");
            System.out.println(e);
        }

        System.out.println(Total);

    }

}
