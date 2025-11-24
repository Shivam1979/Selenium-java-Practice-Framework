package JavaPractice.JavaBasics.StringsQue;

/*
8️⃣ Print Only Unique Characters
Input: "programming"
Output characters that appear once.
*/

public class PrintOnlyUniqueCharacters {

    public static void main(String[] args) {
        String ans = "";
        String str = "abcddohpi";
        // Count frequency loop
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int currentFreq = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    currentFreq++;
                }
            }
            if (currentFreq == 1) {
                ans = ans + ch;
            }

        }
        System.out.println(ans);

    }
}
