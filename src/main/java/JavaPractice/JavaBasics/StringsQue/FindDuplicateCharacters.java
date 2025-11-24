package JavaPractice.JavaBasics.StringsQue;

/*Find Duplicate Characters
Input: "testautomation"
Print all duplicate letters.
Frequency Counting Approach:

Use an array to count occurrences of each character.
Print characters whose frequency > 1.
Reset frequency after printing to avoid duplicates being printed multiple times.
*/

import java.util.Scanner;

public class FindDuplicateCharacters {

     static String  DuplicateChar(String input) {
        int[] freq = new int[256];
        String ans ="";

// Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > 1) {
                ans += ch;
                freq[ch] = 0;
            }

        }
         return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word..");
        String str = sc.nextLine();
        /*FindDuplicateCharacters fd = new FindDuplicateCharacters();
      fd.DuplicateChar(str);
        System.out.println();*/
        System.out.println(DuplicateChar(str));

    }
}
