package JavaPractice.JavaBasics.StringsQue;

import java.util.Scanner;

public class FindSubstring {


    public String substring_1(Scanner sc) {

        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(str + "-" + start + "-" + end);
        String s = str.substring(start, end);
        return s;
    }
    public String substring_2(String str , int start , int end){

        String value = "";
        for(int i = start;i<=end;i++){
            value = value+str.charAt(i);
        }


        return value;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FindSubstring findSubstring = new FindSubstring();
        //System.out.println(findSubstring.substring_1(sc));


       String str1 = findSubstring.substring_2("Selenium",2,5);
        System.out.println(str1);
    }
}
