package Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int array[] = {10,32,34,54,19,29,38,45};
        int max = array[0];
        int secMax = array[1];
        if(secMax>max){
            max = array[1];
            secMax = array[0];
        }
        for(int i = 2; i < array.length; i++){
            if(array[i] > max){
                secMax = max;
                max = array[i];
            }else if (array[i] > secMax){
                secMax = array[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("2nd Max = "+secMax);
    }
}
