package JavaPractice.JavaBasics.StringsQue;

/*Count Occurrence of a Character
Input: "automation" and 'a'
Count how many times 'a' appears.
Approach
Iterative approach:

Traverse the string character by character.
Compare each character with the target character.
Increment a counter when a match is found.
*/

import java.util.Scanner;

public class CountOccurrenceOfCharacter {

    int countChar(String input, char ch) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String str = sc.nextLine();
        System.out.println("Please enter the character to count:");
        char cc = sc.next().charAt(0);

        CountOccurrenceOfCharacter coc = new CountOccurrenceOfCharacter();
        int result = coc.countChar(str, cc);
        System.out.println(result);
    }

}
