public class Main {
    public static void main(String[] args) {
        /*
            Selection Sort Algorithm
            Time Complexity O(N^2)
        */

        int[] unSortedArray = {23,0, 1, 4, 6, 85463, 45, 6, 73, 234, 6, 2, 21};
        System.out.println("Sorting operation...");

        int[] sortedArray = selectionSort(unSortedArray);

        for (int i : sortedArray) {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
