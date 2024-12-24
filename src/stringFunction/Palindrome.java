package stringFunction;

public class Palindrome {
    // Write palindrome code using Madam,Level,Kayak

    public static void Palindrome() {
        //Madam
        //Level
        //Kayak

        String name = "Madam";
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i++) {
            rev = rev + name.charAt(i); //access from string
        }
        if (name.equals(rev)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }

    }

    public static void PalindromeLev() {
        String name = "Level";
        String rev = "";
        for (int i = name.length() - 1; i > 0; i++) {
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }


//            public static void reverse(){
//                String name="Sharmin is the student of UprightTech solution";
//                String rev="";
//                int len=name.length();
//                for(int i=0;i<len;i++)
//                {
//                    rev=name.charAt(i)+rev;
//                }
//                System.out.println(rev);
//                if(name.equalsIgnoreCase(rev)){
//                    System.out.println("This is Palingdrome");
//                }
//                else{
//                    System.out.println("not palingdrome");
//                }
//            }


        }




public static void main(String[] args) {


}
}