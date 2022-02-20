package com.compay;

public class StringBuilderQ2 {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        string.append("It is used to at the specified index position");
        string.insert(13, " insert text");
        System.out.println(string);

    }
}
