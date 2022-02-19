package com.compay;
import java.util.Scanner;
public class Main {
    public static boolean armstrongCheck(int num) {
        String a[] = String.valueOf(num).split("");
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            b += (int) Math.pow(Integer.parseInt(a[i]), 3);
        }
        Boolean e = (b == num);
        return e;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.print(armstrongCheck(num));
    }
}
