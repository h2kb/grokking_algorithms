package Ch04_quicksort.RecursiveCount;

public class RecursiveCount {

    private static int count(int index, int[] arr) {
        if (index == arr.length) {
            return index;
        }

        return count(index + 1, arr);
    }

    public static void main(String[] args) {
        System.out.println(count(0, new int[] {1, 2, 3, 4, 5}));
    }
}
