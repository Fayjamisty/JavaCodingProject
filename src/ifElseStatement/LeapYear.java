package ifElseStatement;

import java.util.Scanner;

public class LeapYear {


/*
4. Write a program to check if a given year is a leap year.
//logical or returns true if one of the statement is true.
Exercise:
for mathematical term we use = but in java we use ==.
A year is a leap year if it is divisible by 4, but not divisible by 100 unless it is also divisible by 400.
Take a year using a variable or from User and print if it's a leap year or not.
*/

    public void leapyr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        boolean isleapyr=
                (year%4==0 && year%100!=0)||(year %400==0);
        System.out.println(year+ "is a leap year?" +isleapyr);
    }
    public void leapyr1(int year){
        if(year%4==0){
            System.out.println("The year is leap year ");
        } else if (year%4 !=0) {
            System.out.println("This is not a leap year" );
        }

    }
    public void leapyr2() {
        int year = 2024; // datatype variable name = initialize the variable
        if (year % 4 == 0) {
            System.out.println(year + " Is a Leap Year");
        } else if (year%100 !=0) {
            System.out.println(year + "Is n0t a leap year");

        } else if (year % 400 == 0)
        {
            System.out.println(year + " Is not a Leap Year");
        }
    }
    public static void main(String[] args) {
        LeapYear obj=new LeapYear();
// obj.leapyr();
// obj.leapyr1(2024);
        obj.leapyr2();


    }
}























