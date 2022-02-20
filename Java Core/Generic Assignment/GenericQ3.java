package com.compay;
class Generic<T>{
    public T[] swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

}
public class GenericQ3 {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,7,8,9};
        Generic<Integer> objGeneric = new Generic<>();
        Integer[] arr1=objGeneric.swap(arr, 1, 3);
        for(int i : arr1) {
            System.out.println(i);
        }

    }

}

