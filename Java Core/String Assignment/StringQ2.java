//Write an application to join the two Strings “Hello, ” & “How are you?”
package com.compay;
import java.util.Scanner;
public class StringQ2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first word :");
        String word = scanner.nextLine();
        System.out.print("Enter second word :");
        String word2 = scanner.nextLine();
        //System.out.println("String after Join two Words is "+word.concat(word2));
        System.out.println("String after Join two Words is "+word+" "+word2);
        scanner.close();

    }
}
