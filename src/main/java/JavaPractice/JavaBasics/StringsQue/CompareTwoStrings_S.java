package JavaPractice.JavaBasics.StringsQue;

import java.util.Scanner;

public class CompareTwoStrings_S {

public boolean comparetwoString(String s1, String s2){
    if (s1.equals(s2)){
        return true;
    }
    return false;
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String..");
        String s1 = sc.nextLine();

        System.out.println("Enter second String..");
        String s2 = sc.nextLine();
        CompareTwoStrings_S compareTwoStringsS = new CompareTwoStrings_S();
        System.out.println(compareTwoStringsS.comparetwoString(s1,s2));

    }
}
