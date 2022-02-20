//Write an application to determine the length of the String str = “Hello World”
package com.compay;
import java.util.Scanner;
public class StringQ1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("length of the String is "+word.length());
        scanner.close();
    }

}
