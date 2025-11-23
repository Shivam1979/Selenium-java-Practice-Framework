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

    String DuplicateChar(String input) {
        int[] freq = new int[256];

// Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > 1) {
                System.out.println(ch + " ");
                freq[ch] = 0;
            }

        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word..");
        String str = sc.nextLine();
        FindDuplicateCharacters fd = new FindDuplicateCharacters();
        String result = fd.DuplicateChar(str);
        System.out.println(result);
    }
}
