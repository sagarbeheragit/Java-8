package search;

public class LinearSearch {
    public static void main(String[] args) {
        int array[] ={3,60,35,2,45,320,5};
        int X = 320;
        for(int i=0;i<array.length;i++){
            if(array[i] == X){
                System.out.println(" Found at Index = "+i);
                return;
            }
        }
        System.out.println("Not Found ");
    }
}
