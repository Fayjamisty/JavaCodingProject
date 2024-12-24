package arraylist;

public class EvenOdd {


/*
Write a Java program to find the number of even and odd integers in a given array of integers.
*/

    public void EvenoddInteger() {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNum = 0;
        int oddNum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {


                System.out.println(num + " is an even num ");
            }
            else{
                System.out.println(num + " is an odd number ");
            }
        }



    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.EvenoddInteger();
    }
}