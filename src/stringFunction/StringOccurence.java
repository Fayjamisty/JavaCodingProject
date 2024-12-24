package stringFunction;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

//    How It Works:
//    Input String: The string you're checking is "shraddha" (you can change this to any string you want).
//    java
//    Copy code
//    String str = "shraddha";
//    Using a Map: A Map (like a dictionary) is used to store each letter and how many times it appears. The Map will store a letter as the key, and the count as the value.
//    java
//    Copy code
//    Map<Character, Integer> letterCount = new HashMap<>();
//    Counting Letters: We go through each letter in the string. For each letter:
//    If it's already in the Map, we increase its count.
//    If it's not in the Map, we add it with a count of 1.
//    java
//    Copy code
//for (char c : str.toCharArray()) {
//        if (letterCount.containsKey(c)) {
//            letterCount.put(c, letterCount.get(c) + 1); // Increase count if letter is found
//        } else {
//            letterCount.put(c, 1); // Add letter with count 1 if not found
//        }
//    }
//    Printing the Results: After counting, the program prints out how many times each letter appeared.
//            java
//    Copy code
//for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
//        System.out.println("Letter '" + entry.getKey() + "' occurs " + entry.getValue() + " time(s).");
//    }
//    Example Output:
//    For the string "shraddha", the output will be:
//    lua
//    Copy code
//    Letter 's' occurs 1 time(s).
//    Letter 'h' occurs 2 time(s).
//    Letter 'r' occurs 1 time(s).
//    Letter 'a' occurs 2 time(s).
//    Letter 'd' occurs 2 time(s).
//    Summary:
//    The program counts how often each letter appears in the string.
//    It uses a Map to store the letter and its count.
//    It then prints the count for each letter.
//    You can change the string to any other string, and it will tell you the count of each character in that string!


    public static void main(String[] args) {
        String str = "UprightTechSolutions";
        Map<Character, Integer> letterCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (letterCount.containsKey(c)) {
                letterCount.put(c, letterCount.get(c) + 1);
            } else {
                letterCount.put(c, 1);
            }
        }

        // Displaying the occurrences of each letter
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println("Letter '" + entry.getKey() + "' occurs " + entry.getValue() + " time(s).");
        }
    }
}
