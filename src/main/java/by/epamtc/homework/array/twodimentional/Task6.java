package by.epamtc.homework.array.twodimentional;

import java.util.Random;

public class Task6 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[][] sourceMatrix = createSourceMatrix(3);

        MatrixPrinter.print(formMagicSquare(sourceMatrix));
    }

    private static int[][] formMagicSquare(int[][] sourceMatrix) {
        int[][] targetMatrix = sourceMatrix.clone();

        while (!isMagicSquare(targetMatrix)) {
            int i1 = random.nextInt(targetMatrix.length);
            int j1 = random.nextInt(targetMatrix.length);
            int i2 = random.nextInt(targetMatrix.length);
            int j2 = random.nextInt(targetMatrix.length);

            int tmpNumber = targetMatrix[i1][j1];
            targetMatrix[i1][j1] = targetMatrix[i2][j2];
            targetMatrix[i2][j2] = tmpNumber;
        }

        return targetMatrix;
    }


    private static boolean isMagicSquare(int[][] matrix) {
        if (sumOfLine(matrix) == null || sumOfColumn(matrix) == null) {
            return false;
        }
        if (
                !sumOfColumn(matrix).equals(sumOfLine(matrix)) &&
                        !diagonalOneSum(matrix).equals(sumOfLine(matrix)) &&
                        !diagonalTwoSum(matrix).equals(sumOfLine(matrix))

        ) {
            return false;
        }
        return true;


    }

    private static Integer sumOfLine(int[][] matrix) {
        int sumOfLine = 0;
        for (int j = 0; j < matrix.length; j++) {
            sumOfLine += matrix[0][j];
        }

        for (int i = 1; i < matrix.length; i++) {
            int tempSumOfLine = 0;
            for (int j = 0; j < matrix.length; j++) {
                tempSumOfLine += matrix[i][j];
            }
            if (tempSumOfLine != sumOfLine) {
                return null;
            }
        }
        return sumOfLine;
    }

    private static Integer sumOfColumn(int[][] matrix) {
        int sumOfColumn = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumOfColumn += matrix[i][0];
        }

        for (int i = 0; i < matrix.length; i++) {
            int tempSumOfColumn = 0;
            for (int j = 1; j < matrix.length; j++) {
                tempSumOfColumn += matrix[i][j];
            }
            if (tempSumOfColumn != sumOfColumn) {
                return null;
            }
        }
        return sumOfColumn;
    }

    private static Integer diagonalOneSum(int[][] matrix) {
        int sumOfDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sumOfDiagonal += matrix[i][j];
                }
            }
        }
        return sumOfDiagonal;
    }

    private static Integer diagonalTwoSum(int[][] matrix) {
        int sumOfDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == Math.abs(j - matrix.length)) {
                    sumOfDiagonal += matrix[i][j];
                }
            }
        }
        return sumOfDiagonal;
    }


    private static int[][] createSourceMatrix(int size) {
        int[][] matrix = new int[size][size];
        int count = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = count;
                count++;
            }

        }
        return matrix;
    }
}
