package Ch04_quicksort.RecursiveSum;

public class RecursiveSum {

    private static int sum(int index, int[] arr) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        return arr[index] + sum(index + 1, arr);
    }

    public static void main(String[] args) {
        System.out.println(sum(0, new int[] {1, 2, 3, 4, 5}));
    }
}
