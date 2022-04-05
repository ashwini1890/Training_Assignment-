/**
 * 1. Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first.
Description:-
Define Functional Interface and write a program to perform arithmetic operations like add, subtract, multiply and divide using functional interface.
Examples:
              Input:-          13       5
              Output:-
                                      18.0      //Addition of 13 and 5
                                       8.0        //Subtraction of 13 and 5
                                       65.0      // Multiplication of 13 and 5  
                                       2.6        //Division of 13 and 5
FunctionalInterface:-
A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
Specifications:
public class Assignment4Q1 {
    public double addition(int num1,int num2){}
    public double subtraction(int num1,int num2){}
    public double multiplication(int num1,int num2){}
    public double division(int num1,int num2){}
    public static void main(String[] args) {}
}
 **/

/**
public class Assignment4Q1 {
	public static void main(String[] args) {
		function add = (a,b)->a+b;
		System.out.println(add.perform(11, 12));
	}
}
**/
interface Operation{
	double perform(int a,int b);
}

public class Assignment4Q1 {
    public static double addition(int num1,int num2){
		return num1+num2;}
    public static double subtraction(int num1,int num2){
		return num1-num2;}
    public static double multiplication(int num1,int num2){
		return num1*num2;}
    public static double division(int num1,int num2){
		return num1/num2;}
    public static void main(String[] args) {
    	Operation addition = (a,b)->addition(a, b);
		System.out.println("addition of numbers is "+addition.perform(110, 12));
		
		Operation substaction = (a,b)->subtraction(a, b);
		System.out.println("substaction of numbers is "+substaction.perform(110, 12));
		
		Operation multiplication = (a,b)->multiplication(a, b);
		System.out.println("multiplication of numbers is "+multiplication.perform(110, 12));
		
		Operation division = (a,b)->division(a, b);
		System.out.println("division of numbers is "+division.perform(3, 2));
    }
}