package by.epamtc.homework.array.onedimentional;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {10007, 3, 1, 5, 8, 6, 4, 10, 2345, 45, 1};
        System.out.println(calcMaxSumAdjacentElements(array));
    }

    private static int calcMaxSumAdjacentElements(int[] array) {
        int tempMaxSum = array[0] + array[1];

        for (int i = 2; i < array.length - 1; i++) {
            if (tempMaxSum < array[i] + array[i + 1]) {
                tempMaxSum = array[i] + array[i + 1];
            }
        }

        return tempMaxSum;
    }

}
