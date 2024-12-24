package stringFunction;

import java.util.HashMap;
import java.util.Map;

public class OccurancePractice1 {
    // Write a program that print the occurances of the each characters for the above string


  public static void occurance(){

      String name = "Automation Testing Practice To Learn Automation";
      Map<Character, Integer> map = new HashMap<>();

      for(int i = 0; i <name.length(); i++){
          char ch = name.charAt(i);


          if (map.containsKey(ch)){
              map.put(ch, map.get(ch)+1);
          }
          else{
              map.put(ch,1);
          }
      }

      System.out.println(map);

  }


    public static void main(String[] args) {
        occurance();
    }







}
