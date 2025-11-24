package JavaPractice.JavaBasics.StringsQue;

import java.util.Scanner;

public class CountWordsinaString {
    public int countWords(String str) {


        int count = 1;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i)==' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        CountWordsinaString countWordsinaString = new CountWordsinaString();
        int count = countWordsinaString.countWords(str);
        System.out.println("Count of word in given string is :" + count);
    }
}
