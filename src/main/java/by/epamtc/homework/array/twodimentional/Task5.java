package by.epamtc.homework.array.twodimentional;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,1}, {0,1,2}};

        int[][] matrix2 = {{1,0}, {0,1}, {1, 1}};

        MatrixPrinter.print(multiplyTwoMatrix(matrix1, matrix2));
        System.out.println();
        MatrixPrinter.print(multiplyTwoMatrix(matrix2, matrix1));
    }

    private static int[][] multiplyTwoMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length){
            System.out.println("Can't multiply");
            return null;
        }
        int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                int elementsSum = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    elementsSum += matrix1[i][k] * matrix2[k][j];
                }
                resultMatrix[i][j] = elementsSum;
            }
        }
        return resultMatrix;
        
    }
}
