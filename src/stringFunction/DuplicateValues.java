package stringFunction;

import java.util.ArrayList;
import java.util.List;

public class DuplicateValues {
    // suppose 1,2,3,4,5,6,4. how to remove duplicate value from list
    public static void removeduplicate() {


        int[] values = {1, 2, 3, 4, 5, 6, 4};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < values.length; i++){
            if(!list.contains(values[i])){
                list.add(values[i]);
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        removeduplicate();
    }
}