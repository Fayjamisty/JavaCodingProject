package loopExercise;

import java.util.Scanner;

public class ReverseDigit {
    /*•
    3. Write a program to reverse the digits of a given integer using a while loop.
     */

    public static void reverseinteger(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to reverse");
        int number = scan.nextInt();

        int reversedigit = 0;
        while(number !=0){
            int digit = number % 10;
             reversedigit = reversedigit * 10 + digit;
             number /=10;
        }
        System.out.println("reversed number: " + reversedigit);
    }

    public static void main(String[] args) {
        reverseinteger();
    }

}
