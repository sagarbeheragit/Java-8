package string;

public class IsPalindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("race a car")); // TAC not same as dog but MOM is same as mom
    }
    public  static boolean isPalindrom(String name){
        //System.out.println(name);
        //name = name.toLowerCase().replaceAll("\\s++","").replaceAll(":","").replaceAll(",", "").replaceAll("\\.", "");
        name = name.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        //System.out.println(name);
        int lenght = name.length();
        if(lenght == 0 || lenght == 1 ) return true;
        if(name.charAt(0) != name.charAt(lenght-1)){
            return false;
        }
        return  isPalindrom(name.substring(1,lenght-1));
    }

    public static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        int last = s.length() - 1;
        int start=0;
        while(start<=last) {
            char cf = a.charAt(start);
            char cl = a.charAt(last);
            if (!Character.isLetterOrDigit(cf)) {
                start++;
            } else if (!Character.isLetterOrDigit(cl)) {
                last--;
            } else {
                if (cf != cl) return false;
                start++;
                last--;
            }
        }
        return true;
    }
}
