package stringFunction;

public class CharRev {
    /*
Suppose there is a string “This is a mentoring session” how to reverse only string -- not the character.
     */

    public static void reverstr(){
        String s="This is mentoring session"; // we r expecting this character "session mentoring a is this "we r
        String rev = ""; // storing some variable                     // reversing a string not the character
     String value[] = s.split(" ");// for splitting the string we r using this method

//        for(int i =0; i<value.length;i++){  // normally we use for loop to return the
//            // reverse string directly
//            System.out.println(value[i]); // we r printing the value of i
//        }
        //after run this it will print everything separately
        for (int i = s.length()-1;i>=0;i++){  //using this for loop  we r itterating the array
            //rev+=s.charAt(i);
            rev = rev +value[i] +" "; //getting the values one by one and storing into it

            //value[4]=session,value[3]=mentoring,value[2]=a,value[1]=is,value[0]=this.
        }
        System.out.println(rev); // printing the
    }

    public static void main(String[] args) {
        reverstr();
    }
}
