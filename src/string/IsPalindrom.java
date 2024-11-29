package string;

public class IsPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("mom"));
    }
    public  static boolean isPalindrom(String name){
        int lenght = name.length();
        if(lenght == 0 || lenght == 1 ) return true;
        if(name.charAt(0) != name.charAt(lenght-1)){
            return false;
        }
        return  isPalindrom(name.substring(1,lenght-1));
    }
}
