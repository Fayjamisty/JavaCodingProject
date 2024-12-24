package loopExercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationNumber {

    /*2. Write a program that prints the multiplication table of a given number using a for loop. */

    public static void multiplication(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        System.out.println("Multiplication table of" + number);

        for(int i = 1; i<=10; i++){ //1+1 = 2
            System.out.println(number+ " x " + i + "=" +(number*i)); //

                             // 2+ x + 1 = 2 (2*2) = 4

        }
    }

    public static void main(String[] args) {
     multiplication();
    }

}


