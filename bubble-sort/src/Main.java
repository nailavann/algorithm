public class Main {
    public static void main(String[] args) {
         /*
            Bubble Sort Algorithm
            Time Complexity O(N^2)
        */

        int[] unSortedArray = {23, 0, 1, 4, 6, 85463, 45, 6, 73, 234, 6, 2, 21};
        System.out.println("Sorting operation...");

        int[] sortedArray = bubbleSort(unSortedArray);

        for (int i : sortedArray) {
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}