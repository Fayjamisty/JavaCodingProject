package stringFunction;

public class PalindromePractice {
    //Madam
    //Level
    //Kayak



        public static boolean checkPalindrome(String name){
            String rev ="";
            for (int i = name.length()-1; i>=0;i--){
                rev = rev+name.charAt(i);
            }
// System.out.println(rev);
            return rev.equalsIgnoreCase(name); // if we use equalignore case it will ignore the case and return the results
        }

        public static void main(String[] args) {
            String name ="Kayak"; // im declaring  Kayak
            if (checkPalindrome(name)){
                System.out.println("This is Palindrome");
            }
            else {
                System.out.println("This is not Palindrome");
            }
            name ="Sumaia";
            if (checkPalindrome(name)){
                System.out.println("This is Palindrome");
            }
            else {
                System.out.println("This is not Palindrome");
            }
            name ="Level";
            if (checkPalindrome(name)){
                System.out.println("This is Palindrome");
            }
            else {
                System.out.println("This is not Palindrome");
            }
        }

    }
