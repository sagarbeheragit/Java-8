package string;

public class SwapTwoStrings {
    public static void main(String[] args) {
        String str1 = "good";
        String str2 = "badass";

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        System.out.println(str1);
        str1 = str1.substring(str2.length());

        System.out.println("S1 "+str1);
        System.out.println("S2 "+str2);
    }


}
