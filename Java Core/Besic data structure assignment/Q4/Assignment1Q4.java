//Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:
//              Condition 1: -All subjects marks is greater than 60 is Passed
//              Condition 2: -Any two subjects marks are greater than 60 is Promoted
//              Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.

package com.compay;
import java.util.Scanner;
public class Assignment1Q4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double subject1Marks=scanner.nextDouble(),subject2Marks=scanner.nextDouble(),subject3Marks=scanner.nextDouble();
        System.out.print(ResultDeclaration.declareResults(subject1Marks,subject2Marks,subject3Marks));
        scanner.close();

    }

}
