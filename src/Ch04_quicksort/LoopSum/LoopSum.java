package Ch04_quicksort.LoopSum;

public class LoopSum {

    private static int sum(int[] arr) {
        int result = 0;
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {1, 2, 3, 4}));
    }
}
