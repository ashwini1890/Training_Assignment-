//Q2. Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour where Manager & Labour are the sub classes of the Employee.
// Manager has incentive & Labour has over time. Add the functionality to calculate total salary of all the employees. Use polymorphism i.e. method overriding.
//Description:-
//Write a program to claculate the total salaries given to all the employees by an organization.
// In this organization there are employees category under which Manager and Labour are working where manager will recieve incentive and labourer will receive overtime benifits.
package com.compay;
import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }

}
public class Assignment2Q2 {
    static int salary = 10000;
    static int sum = 0,i;
    public int getSalary(int salary){
        return 0;

    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        for (i=0;i<=employeeSalaries.size()-1;i++) {
            sum = sum   + employeeSalaries.get(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> employeeSalaries = new ArrayList<>();
        Labour obj1 = new Labour();
        Manager obj2 = new Manager();
        employeeSalaries.add(obj1.getSalary(salary));
        employeeSalaries.add(obj2.getSalary(salary));
        System.out.println(totalEmployeesSalary(employeeSalaries));

    }
}
