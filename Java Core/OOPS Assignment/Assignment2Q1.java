//Q1. Write a singleton class. Confirm that singleton class cannot be inherited.
//Singleton Class:-
//The singleton design pattern is used to restrict the instantiation of a class and ensures that only one instance of the class exists in the JVM.
// In other words, a singleton class is a class that can have only one object (an instance of the class) at a time per JVM instance.


package com.compay;
class SingletonInheritanceCheck{
    private static SingletonInheritanceCheck sInstance = null;
    public String msg;
    private SingletonInheritanceCheck()
    {
        msg = "Singleton Test";
    }
    public static SingletonInheritanceCheck getInstance()
    {
        if (sInstance == null)
            sInstance = new SingletonInheritanceCheck();
        return sInstance;
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        SingletonInheritanceCheck obj = SingletonInheritanceCheck.getInstance();
        System.out.println(obj.msg);

    }
}
