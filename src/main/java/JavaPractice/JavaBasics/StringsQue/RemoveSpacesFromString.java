package JavaPractice.JavaBasics.StringsQue;

public class RemoveSpacesFromString {

    public void removeSpace_03(String str) {
        String str1 = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!(str.charAt(i) == ' ')) {
                 str1 = str1 + str.charAt(i);
            }
        }
        System.out.println(str1);
    }

    public void removeSpace_01(String str){
        String output = str.replace(" ","");
        System.out.println(output);
    }

    public void removeSpace_02(String str){
        String output = str.replaceAll("\\s","");
        System.out.println(output);
    }



    public static void main(String[] args) {
        RemoveSpacesFromString removeSpacesFromString = new RemoveSpacesFromString();
        removeSpacesFromString.removeSpace_03("  S hi vam Sin gh");
        removeSpacesFromString.removeSpace_01("Tan u j ha");
        removeSpacesFromString.removeSpace_02("s a ki ra");

    }
}
