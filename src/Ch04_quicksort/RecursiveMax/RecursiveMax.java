package Ch04_quicksort.RecursiveMax;

import java.util.Arrays;

public class RecursiveMax {

    private static int max(int[] arr) {
        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }

        int subMax = max(Arrays.copyOfRange(arr, 1, arr.length));

        return arr[0] > subMax ? arr[0] : subMax;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[] {20, 15, 2, 6, 31, 22, 17, 55}));
    }
}
