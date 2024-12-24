package arraylist;

import java.util.ArrayList;

public class AddingArrayList {

    public static void Addingarraylist(){
        int[] numbers = {100,200,300,400,500};

        // initializing a variable to hold the sum

        int sum = 0;

        // loop through the array and add each number to sum

        for(int num: numbers){
            sum += num; // sum = sum+num;
        }

        System.out.println("sum using ArrayList: " + sum);
    }

    public static void arraylistfunc(){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        // Initialize a variable to hold the sum

        int sum = 0;

        for(int num: numbers){
            sum += num; // sum = sum+num;
        }

        System.out.println("sum using ArrayList: " + sum);
    }

    }

