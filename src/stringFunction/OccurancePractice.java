package stringFunction;

import java.util.HashMap;
import java.util.Map;

public class OccurancePractice {

    //Let take your first name “uprigttechsolutions”.
// Write a program that print the occurances of the each characters.
// Lets’s say u is displaying 2 times, t three times, p 1 time.

    public static void OccurancePr() {


        String name = "uprighttechsolutions";
        Map<Character, Integer> map = new HashMap<>();  // Syntax for Hashmap

        for(int i =0; i<name.length(); i++) {
            char ch = name.toLowerCase().charAt(i); // returns the character at the specified index

            if (map.containsKey(ch)) { //contains key we used to check if the key is present or not
                map.put(ch, map.get(ch) + 1);  // taking the excisting character value and aooending with 1

            } else {

                map.put(ch, 1);  // if value does not exist in map we are adding character and count as 1 into

            }
        }

            for(char ch:map.keySet()){
                if(ch != ' '){
                    System.out.println(ch+""+map.get(ch));  //shows key and value together Ex:c 1
                }
            }
            System.out.println(map);
        }



    public static void main(String[] args) {
       OccurancePr();
    }
}