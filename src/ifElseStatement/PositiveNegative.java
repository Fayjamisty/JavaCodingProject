package ifElseStatement;

import java.util.Scanner;

public class PositiveNegative {

    /* Write an if-else statement that checks if a number is positive, negative, or zero.
    Exercise:
    Take an input number using a variable or from User.
    Print "Positive" if the number is greater than zero.
    Print "Negative" if the number is less than zero.
    Print "Zero" if the number is exactly zero.
    *///float and double we use for decimal number
//public void number( int number){
// if(number>=0)
    public void number(double num){

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
    public void number1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        double num1=sc.nextDouble();
        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative obj= new PositiveNegative();
// obj.number(89.7);
        obj.number1();
    }
}




