//* Find out all the Armstrong numbers falling in the range of 100-999

package com.compay;

public class ArmstrongNumBetweenRange {
    public static void main(String[] args) {
        for (int k = 100 ; k < 1000 ; k++)
        {
            int temp = k;
            int r = 0;
            int sum = 0;

            while (temp > 0)
            {
                r = temp % 10;
                temp= temp/ 10;
                sum = sum + (r * r * r);
            }
            if (k == sum)
            {
                System.out.println (k);
            }
        }
    }

}


