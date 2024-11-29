package numbers;

public class GCD {
    public static void main(String[] args) {
        int a = 60;
        int b = 55;
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b){
        return b== 0 ? a : gcd(b,a%b);
    }



}
