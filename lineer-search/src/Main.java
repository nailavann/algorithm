public class Main {
    public static void main(String[] args) {
        /*
            Lineer Search
            Time Complexity O(N)
        */

        int[] array = {23, 0, 1, 4, 6, 85463, 45, 6, 73, 234, 6, 2, 21};
        int search = 84;
        int index = lineerSearch(array, search);
        if (index != -1) {
            System.out.println("Index: " + index);
        } else {
            System.out.println("Not in the array...");
        }

    }

    private static int lineerSearch(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}