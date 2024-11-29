package matrix;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int matrixA[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int row1 = 4, col1 = 4;

        int matrixB[][] = {
                {5,10,15,20},
                {25,30,35,40},
                {45,50,55,60},
                {65,70,75,80}
        };
        int row2 = 4, col2 = 4;
        int row = row1;
        int col = col1;
        int resultMatrix[][] = new int[row][col];
        for(int i =0; i < row; i++){
            for(int j = 0; j < col; j++){
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print(resultMatrix[i][j]+" ");
            System.out.println();
        }
        //System.out.println(Arrays.stream(resultMatrix).toList());
    }

}
