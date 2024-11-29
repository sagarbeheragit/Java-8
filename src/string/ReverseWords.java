package string;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String[] words = str.split("\\s+");
        System.out.println(Arrays.stream(words).toList());
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1; i >=0; i--){
            result.append(words[i]);
            if(i != 0){
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
