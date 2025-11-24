package JavaPractice.JavaBasics.StringsQue;

import java.util.Scanner;

public class CountOccurrenceofaCharacter {


    public int countOccurance(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        CountOccurrenceofaCharacter countOccurrenceofaCharacter = new CountOccurrenceofaCharacter();
        System.out.println(countOccurrenceofaCharacter.countOccurance(str,ch));
    }
}
