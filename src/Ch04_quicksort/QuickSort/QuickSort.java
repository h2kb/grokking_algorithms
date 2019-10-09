package Ch04_quicksort.QuickSort;

public class QuickSort {

    private static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static void doQuickSort(int[] arr, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = arr[(leftMarker + rightMarker) / 2];

        do {
            while (arr[leftMarker] < pivot) {
                leftMarker += 1;
            }

            while (arr[rightMarker] > pivot) {
                rightMarker -= 1;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(arr, leftMarker, rightMarker);
                }

                leftMarker += 1;
                rightMarker -= 1;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            doQuickSort(arr, leftMarker, rightBorder);
        }

        if (leftBorder < rightMarker) {
            doQuickSort(arr, leftBorder, rightMarker);
        }
    }

    public static void quickSort(int[] arr) {
        doQuickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {46, 55, 56, 74, 62, 72, 64, 95, 36, 28, 64, 39, 43, 80, 64, 72, 82, 29, 29, 43, 31, 54, 37, 30,
                8, 96, 16, 63, 87, 96};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        quickSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}