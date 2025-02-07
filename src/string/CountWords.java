package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWords {
    public static void main(String[] args) {
        String words = "java    programming";
        List<String> wordList = Arrays.stream(words.split(" ")).toList();
        System.out.println(wordList);
        String[] word = words.split("\\s+");
        System.out.println(words);
        System.out.println(Arrays.asList(word).size());
        System.out.println(countWords(words));
        count("sagAr");
    }
    private static int countWords(String str){
        int count = 1;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //System.out.println(ch);
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                count++;
                ch = str.charAt(i+1);
                while(ch == ' ' || ch == '\t' || ch == '\n'){
                    i++;
                    ch = str.charAt(i+1);
                    //this while loop removes continuous white spaces
                }
            }
        }
        return count;
    }

    private static void count(String name) {
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = 0;
        for (char c: name.toCharArray()){
            if (vowels.contains(Character.toLowerCase(c))) {
                count++;
            }
        }
        System.out.println("Vowel Count = "+count);

    }
}
