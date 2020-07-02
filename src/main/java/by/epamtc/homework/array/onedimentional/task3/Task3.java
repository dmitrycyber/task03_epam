package by.epamtc.homework.array.onedimentional.task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] lock1 = new int[]{0, 4, 5, 0, 0, 0, 0, 0, 0, 0}; //positive
        int[] lock2 = new int[]{0, 1, 0, 0, 0, 0, 0, 1, 0, 0}; //positive
        int[] lock3 = new int[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 0}; //negative
        int[] lock4 = new int[]{0, 0, 0, 0, 0, 0, 0, 6, 0, 4}; //negative

        try {
            System.out.println(Arrays.toString(unlock(lock2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int[] unlock(int[] array) throws Exception {
        if (!isPossibleToOpen(array)) {
            throw new Exception("Can't open");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            if (array[i] == 0) {
                if (i == 0) {
                    array[i] = 10 - getRightSum(array, i);
                }
                if (i == 1) {
                    array[i] = 10 - getMaxSum(getMidSum(array, i), getRightSum(array, i));
                }
                if (i > 1 && i <= array.length - 3) {
                    array[i] = 10 - getMaxSum(getLeftSum(array, i), getMidSum(array, i), getRightSum(array, i));
                }
                if (i == array.length - 2) {
                    array[i] = 10 - getMaxSum(getLeftSum(array, i), getMidSum(array, i));
                }
                if (i == array.length - 1) {
                    array[i] = 10 - getLeftSum(array, i);
                }
            }
        }
        return array;
    }


    private static int getLeftSum(int[] array, int index) {
        int sum = array[index] + array[index - 1] + array[index - 2];
        if (sum < 4) {
            return 4;
        }
        return sum;
    }

    private static int getMidSum(int[] array, int index) {
        int sum = array[index - 1] + array[index] + array[index + 1];
        if (sum < 4) {
            return 4;
        }
        return sum;
    }

    private static int getRightSum(int[] array, int index) {
        int sum = array[index] + array[index + 1] + array[index + 2];
        if (sum < 4) {
            return 4;
        }
        return sum;
    }

    private static int getMaxSum(int... a) {
        if (a.length == 2) {
            return Math.max(a[0], a[1]);
        }
        return Math.max(Math.max(a[0], a[1]), Math.max(a[1], a[2]));
    }

    private static IndexOfOccupiedCellsModel getOccupiedCells(int[] array) {
        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && firstIndex == -1) {
                firstIndex = i;
            }
            if (array[i] != 0) {
                secondIndex = i;
            }
        }
        return new IndexOfOccupiedCellsModel(firstIndex, secondIndex);
    }

    private static boolean isPossibleToOpen(int[] array) {
        IndexOfOccupiedCellsModel occupiedCells = getOccupiedCells(array);
        System.out.println(occupiedCells);
        if (occupiedCells.getSecondIndex() - occupiedCells.getFirstIndex() < 3 &&
                array[occupiedCells.getFirstIndex()] + array[occupiedCells.getSecondIndex()] < 4) {
            return false;
        }

        for (int i = 1; i < array.length - 1; i++) {
            int sum = array[i - 1] + array[i] + array[i + 1];
            if (sum >= 10) {
                return false;
            }
        }
        return true;
    }
}
