package loopExercise;

import java.util.Scanner;

public class NaturalNumber {
    /*1. Write a program that takes an integer n and calculates the sum of the first n natural numbers using a while loop.*/

//    public void sumnaturalNumbers(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = scan.nextInt();
//
//        int sum= 0; //initializing
//        int i = 1;
//
//        while(i<=n){  //loop condition
//            sum+=1; //sum=sum+i; 0=0+1
//            i++; //
//        }
//
//        System.out.println("sum of first" +n+"natural numbers:" +sum);
//    }
//
//    public static void main(String[] args) {
//        NaturalNumber obj = new NaturalNumber();
//        obj.sumnaturalNumbers();
//    }



    public void sumnaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int sum = 0;
        int i =1; //initialization
        while (i<=n){ //condition
            sum+=i; //sum=sum+i
//0=0+1
//1
            i++;
        }

        System.out.println("Sum of first" + n+ "natural numbers:" +sum);


    }

    public static void main(String[] args) {
        NaturalNumber obj = new NaturalNumber();
        obj.sumnaturalNumbers();
    }


    //Let’s walk through the program step-by-step with an example. Suppose we input the value n=5n = 5n=5. Here’s how the program calculates the sum of the first 5 natural numbers:
    //Program Setup: The program prompts the user to enter a positive integer. We enter 5, so n=5n = 5n=5.
    //Variable Initialization:
    //sum is initialized to 0. This variable will store the running total of the sum.
    //i is initialized to 1. This variable helps keep track of the current number to add to sum.
    //While Loop Execution: The loop will run as long as i is less than or equal to n (i.e., i <= 5).
    //First Iteration (i = 1):
    //sum += i adds i to sum, so sum = 0 + 1 = 1.
    //Then i++ increments i by 1, so now i = 2.
    //Second Iteration (i = 2):
    //sum += i adds i to sum, so sum = 1 + 2 = 3.
    //Then i++ increments i by 1, so now i = 3.
    //Third Iteration (i = 3):
    //sum += i adds i to sum, so sum = 3 + 3 = 6.
    //Then i++ increments i by 1, so now i = 4.
    //Fourth Iteration (i = 4):
    //sum += i adds i to sum, so sum = 6 + 4 = 10.
    //Then i++ increments i by 1, so now i = 5.
    //Fifth Iteration (i = 5):
    //sum += i adds i to sum, so sum = 10 + 5 = 15.
    //Then i++ increments i by 1, so now i = 6.
    //Loop Exit: The loop stops because i is now 6, which is greater than n (5).
    //Result:
    //The program prints The sum of the first 5 natural numbers is: 15.
    //Final Answer:
    //The output for n = 5 is:
    //python
    //Copy code
    //The sum of the first 5 natural numbers is: 15
    //
    //This is correct, as the sum of the first 5 natural numbers 1+2+3+4+5=151 + 2 + 3 + 4 + 5 = 151+2+3+4+5=15.

}

