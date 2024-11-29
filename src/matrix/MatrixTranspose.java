package matrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6}
        };
        int rows = 2;
        int columns = 3;

        int rowT = columns;
        int colT = rows;

        int[][] matrixT = new int[rowT][colT];
        for(int i=0; i<rowT;i++){
            for(int j=0; j < colT; j++){
                matrixT[i][j] = matrix[j][i];
            }
        }
        //Print
        for(int i=0;i<rowT;i++){
            for(int j=0;j<colT;j++)
                System.out.print(matrixT[i][j]+" ");
            System.out.println();
        }
    }
}
