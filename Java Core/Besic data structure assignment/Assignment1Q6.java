//Q6. Consider a CUI based application, where you are asking a user to enter his Login name and password,
// after entering the valid user-id and password it will print the message “Welcome” along with user name.
// As per the validation is concerned, the program should keep a track of login attempts.
// After three attempts a message should be flashed saying “Contact Admin” and the program should terminate.

package com.compay;
import java.util.Scanner;
class Login{
    static String userId = "Ajay";
    static String password = "password";
    static int i=3;
    public static String loginUser(String user, String pass) {
        i--;
        String z=null;
        if((user.equals(userId) && pass.equals(password))) {
            z= "Welcome "+userId;

        }
        else if(i>=1) {
            z="You have entered wrong credentials ,please enter the right credentials\n";
        }
        else {
            z= "You have entered wrong credentials 3 times \nContact Admin";
        }
        return z;


    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
        int i=3;
        Scanner scanner=new Scanner(System.in);
        while(i>0) {
            System.out.println("userId: ");
            String user=scanner.next();
            System.out.println("password: ");
            String pass=scanner.next();
            String name = Login.loginUser(user, pass);
            System.out.print(name);
            i--;
        }

    }
}
