package ifElseStatement;

/*
 2. Write a Java function and use the parameter of an integer between 1 and 7.
 It displays the weekday name.
 */

import java.util.Scanner;

public class WeekDayPractice {

    public static void weekDayName(int day){  //parameter of a integer
//        Scanner scan = new Scanner(System.in);  //read files from users and consoles
//        System.out.println("Enter Weekday");
//        int day = scan.nextInt();

        if(day == 1 ){
            System.out.println("monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day ==3 ){
            System.out.println("Wednesday");
        }
        else if(day == 4){
            System.out.println("Thursday");
        }
        else if(day ==5){
            System.out.println("Friday");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
        else if(day ==7){
            System.out.println("Sunday");
        }

    }

    public static void main(String[] args) {
        WeekDayPractice obj = new WeekDayPractice();
        weekDayName(5);
    }
}
