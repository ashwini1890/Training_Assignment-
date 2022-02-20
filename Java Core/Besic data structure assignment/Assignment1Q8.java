//Bubble sort is a simple sorting algorithm.
// This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order.
// This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.
//Example-
//              Input :       5 12 14 6 78 19 1 23 26 35 37 7 52 86 47
//              Output:       1 5 6 7 12 14 19 23 26 35 37 47 52 78 86

package com.compay;
import java.util.Arrays;
public class Assignment1Q8 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.print(Arrays.toString(arr));

    }
}
