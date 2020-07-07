package by.epamtc.homework.array.onedimentional;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {-1, -1, -1, -1, 10007, 3, 1, 5, 8, 6, 4, 10, 2345, 45, 1, 1, 1, 0, 0, 0, 0};
        System.out.println(findMostCommonNumber(array));
    }

    private static int findMostCommonNumber(int[] array) {
        int tempNumber = array[0];
        int frequency = 1;

        for (int i = 1; i < array.length; i++) {
            int tempFrequency = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tempFrequency++;
                }
            }
            if (tempFrequency >= frequency && array[i] < tempNumber) {
                tempNumber = array[i];
                frequency = tempFrequency;
            }
        }
        return tempNumber;


    }
}
