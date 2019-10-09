package Additional.Sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean wasSwappable = true;
        int temp = 0;

        while (wasSwappable) {
            wasSwappable = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    wasSwappable = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 17 ,3, 19, 11};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
