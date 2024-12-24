package arraylist;

import java.util.ArrayList;

public class ArrayListFormat {

    /*Take 5 numbers like 100,200,300,400,500 and use it in an array List format and print out all the numbers using loop. */
    public static void arraylist() {
        //  ArrayList<Integer> num=new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("Kiwi");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));  // to access an element in the Arraylist use get() method and refer to the index number,
        }
//        num.add(100);
//        num.add(200);
//        num.add(300);
//        num.add(400);
//        num.add(500);
//        for(int i=0;i< num.size();i++){
//            System.out.println(num.get(i));
    }


    public static void main(String[] args) {
      arraylist();
    }
}