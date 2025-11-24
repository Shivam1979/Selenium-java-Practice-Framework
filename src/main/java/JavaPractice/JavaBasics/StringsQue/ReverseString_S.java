package JavaPractice.JavaBasics.StringsQue;
import java.util.Scanner;
public class ReverseString_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString_S reverseString = new ReverseString_S();
        reverseString.reverString(str);
        System.out.println(reverseString.reverString(str));
    }
    public String reverString(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }
}
