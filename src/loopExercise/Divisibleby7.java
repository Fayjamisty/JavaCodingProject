package loopExercise;

public class Divisibleby7 {

    /*
    4. Write a function and create a loop inside it from 20-50 and find which number is divisible by 7
    */

    public static void numberdiv() {


        for (int i = 20; i < 50; i++) {
            if(1%7==0){
                System.out.println("number is divisible by 7");
            }
            else if(1%7 !=0){
                System.out.println("number is not divisible by 7");
            }

        }

    }

    public static void main(String[] args) {
        numberdiv();
    }
}
