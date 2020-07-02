package by.epamtc.homework.array.onedimentional.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10007, 3, 1, 5, 8, 6, 4, 10, 2345, 45, 1};
        System.out.println(Arrays.toString(removeMinElementsFromArray(array)));
    }

    private static int[] removeMinElementsFromArray(int[] array) {
        MinElementCountModel minElementCount = getMinElementCount(array);

        int newIndex = 0;

        int[] newArray = new int[array.length - minElementCount.getCountOfMinElement()];
        for (int value : array) {
            if (value != minElementCount.getMinElement()) {
                newArray[newIndex] = value;
                newIndex++;
            }
        }
        return newArray;
    }

    private static MinElementCountModel getMinElementCount(int[] array){
        int tempMinElement = array[0];
        int countOfMinElement = 0;
        for (int value : array) {
            if (value == tempMinElement) {
                countOfMinElement++;
            }
            if (value < tempMinElement) {
                tempMinElement = value;
                countOfMinElement = 1;
            }
        }
        return new MinElementCountModel(tempMinElement, countOfMinElement);
    }
}
