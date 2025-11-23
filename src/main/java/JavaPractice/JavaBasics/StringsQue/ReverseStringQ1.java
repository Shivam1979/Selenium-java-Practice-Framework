package JavaPractice.JavaBasics.StringsQue;

import java.util.Scanner;


/*Write a method reverseString(String input)
Return the reversed string without using StringBuilder.reverse().
WHAT IS THE QUE
INPUT AND OUTPUT  - NAME THE OUTPUT IS GETTING AS EMAN
APPROACH
TIME COMPLEXCITY
 */

public class ReverseStringQ1 {
    String reverseString(String input) {
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        return rev;
    }
    //RETURN TYPE IS BOOLEAN METHOD Nme check palindrome(string original,string reverse)inside methode compare
    // if both same
    // return true else false ;
    // store in main menthode and print the result.

    Boolean checkPalindrome(String original, String reverse) {
        if (original.equalsIgnoreCase(reverse)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter a word that you want to reversed..");
        String str = SC.nextLine();
        ReverseStringQ1 Q1 = new ReverseStringQ1();
        String reverseString = Q1.reverseString(str);
        System.out.println(reverseString);
        boolean palindromResult = Q1.checkPalindrome(str, reverseString);
        System.out.println(palindromResult);

    }
}
