package by.epamtc.homework.array.onedimentional;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {10007, 3, 1, 5, 8, 6, 4, 10, 2345, 45, 1};
        System.out.println(getSumMaxEvenMinOddElement(array));
    }

    private static int getSumMaxEvenMinOddElement(int[] array) {
        int tempMinOdd = array[0];
        int tempMaxEven = array[1];

        for (int i = 2; i < array.length; i++) {
            if ((i+1) % 2 == 0){
                if (array[i] > tempMaxEven){
                    tempMaxEven = array[i];
                }
            }
            if ((i+1) % 2 != 0){
                if (array[i] < tempMinOdd){
                    tempMinOdd = array[i];
                }
            }
        }
        System.out.println("Max Even: " + tempMaxEven);
        System.out.println("Min Odd: " + tempMinOdd);
        return tempMaxEven + tempMinOdd;
    }


}
