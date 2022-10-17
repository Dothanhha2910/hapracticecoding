package matrixpractice;


public class Matrix {
    private int[][] matrix;

    public Matrix(int row, int column){
        this.matrix = new int[row][column];
    }
    public int[][] getMatrix(){
        return this.matrix;
    }
    public void setMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                this.matrix[i][j] = matrix[i][j];
            }
        }
    }
    public int total(int[][] matrix1, int[][] matrix2){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j<matrix1[i].length; j++){
                sum1 += matrix1[i][j];
            }
        }
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j<matrix2[i].length; j++){
                sum2 += matrix2[i][j];
            }
        }
        return sum1 + sum2;
    }
    public int multiple(int[][] matrix1, int[][] matrix2){
        int mul1 = 1;
        int mul2 = 1;
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j<matrix1[i].length; j++){
                mul1 *= matrix1[i][j];
            }
        }
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j<matrix2[i].length; j++){
                mul2 *= matrix2[i][j];
            }
        }
        return mul1 * mul2;
    }
    
}
