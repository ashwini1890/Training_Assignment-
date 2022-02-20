/**
 * Write an application that accepts two numbers, divides the first number with the second
 number and display the result.handle ArithmeticException by raising
 UnsupportedOperationException as a solution
 */

package com.compay;
import java.util.Scanner;
public class ExceptionQ2 {
    public static void main(String[] args) {
        int Total=0;
        try(Scanner scanner =new Scanner(System.in);) {
            System.out.print("Enter first number :");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter second number :");
            int secondNumber = scanner.nextInt();
            if(secondNumber!=0)
                Total = firstNumber/secondNumber;
            else {
                throw new UnsupportedOperationException();
            }
        } catch (UnsupportedOperationException e) {
            // TODO Auto-generated catch block
            System.out.println("error");
            System.out.println(e);
        }

        System.out.println(Total);

    }

}
