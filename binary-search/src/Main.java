
public class Main {
    public static void main(String[] args) {

         /*
            Binary Search
            Time Complexity O(logn)
        */

        int[] array = new int[100];
        int target = 42;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        binarySearch(array, array[0], array[array.length - 1], target);
    }

    private static void binarySearch(int[] array, int start, int end, int target) {
        if (start > end) {
            System.out.println("not found");
            return;
        }

        int middle = start + (end - start) / 2;

        if (array[middle] == target) {
            System.out.println("Target index: " + middle);
            return;
        }

        if (array[middle] > target) {
            binarySearch(array, start, middle - 1, target);
        } else {
            binarySearch(array, middle + 1, end, target);

        }

    }
}