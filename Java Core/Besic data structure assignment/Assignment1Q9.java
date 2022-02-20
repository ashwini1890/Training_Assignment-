//Q9. Accept the marks of three students for the subject say A, B, C. Find the total scored and the average in all the subjects.
// Also Find the Total and Average scored by students in each respective Subject.
//Description:-
//Enter the marks of 3 students for subjects A,B,C.
// Find the total marks secured by respective student in all the subjects and also find the total and average scored by students subject wise.
//Example:-
//              Sample Input:-
//                             marks of Student 1 in subjects A,B,C
//                                           10 20 30
//                             marks of Student 2 in subjects A,B,C
//                                           10 20 30
//                             marks of Student 3 in subjects A,B,C
//                                           10 20 30
//              Sample Output:-
//
//                             180                                   Total marks of all the students in all subjects
//
//                             60.0                                  Average marks of all the students in all subjects
//
//                             30                                    Total marks scored by students in subject A
//
//                             10.0                                  Average marks scored by students in subject A
//
//                             60                                    Total marks scored by students in subject B
//
//                             20.0                                  Average marks scored by students in subject B
//
//                             90                                    Total marks scored by students in subject C
//
//                             30.0                                  Average marks scored by students in

package com.compay;
import java.util.*;
public class Assignment1Q9 {
    public static void main(String[] args)
    {
        int a1,b1,c1,a2,b2,c2,a3,b3,c3,d=0,d1=0,d2=0,d3=0;
        float avg=0,avg1=0,avg2=0,avg3=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of student 1:");
        a1=sc.nextInt();
        b1=sc.nextInt();
        c1=sc.nextInt();
        System.out.print("Enter the marks of student 2:");
        a2=sc.nextInt();
        b2=sc.nextInt();
        c2=sc.nextInt();
        System.out.print("Enter the marks of student 3:");
        a3=sc.nextInt();
        b3=sc.nextInt();
        c3=sc.nextInt();
        d=a1+b1+c1+a2+b2+c2+a3+b3+c3;
        avg=d/3;
        d1=a1+a2+a3;
        d2=b1+b2+b3;
        d3=c1+c2+c3;
        avg1=d1/3;
        avg2=d2/3;
        avg3=d3/3;
        System.out.println(d);
        System.out.println(avg);
        System.out.println(d1);
        System.out.println(avg1);
        System.out.println(d2);
        System.out.println(avg2);
        System.out.println(d3);
        System.out.println(avg3);
    }
}
