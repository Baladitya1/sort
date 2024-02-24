package sort;
import java.util.Arrays;

public class SortingComparison {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 0};
        int[] bubbleSortArr = arr.clone();
        int[] selectionSortArr = arr.clone();
        int[] insertionSortArr = arr.clone();
        int[] arraySortArr = arr.clone();

        long startTimeBubbleSort = System.nanoTime();
        bubbleSort(bubbleSortArr);
        long endTimeBubbleSort = System.nanoTime();
        System.out.println("Bubble Sort took " + (endTimeBubbleSort - startTimeBubbleSort) + " nanoseconds");

        long startTimeSelectionSort = System.nanoTime();
        selectionSort(selectionSortArr);
        long endTimeSelectionSort = System.nanoTime();
        System.out.println("Selection Sort took " + (endTimeSelectionSort - startTimeSelectionSort) + " nanoseconds");

        long startTimeInsertionSort = System.nanoTime();
        insertionSort(insertionSortArr);
        long endTimeInsertionSort = System.nanoTime();
        System.out.println("Insertion Sort took " + (endTimeInsertionSort - startTimeInsertionSort) + " nanoseconds");

        long startTimeArraySort = System.nanoTime();
        Arrays.sort(arraySortArr);
        long endTimeArraySort = System.nanoTime();
        System.out.println("Arrays.sort() took " + (endTimeArraySort - startTimeArraySort) + " nanoseconds");
        
        System.out.println("Bubble Sort Result: " + Arrays.toString(bubbleSortArr));
        System.out.println("Selection Sort Result: " + Arrays.toString(selectionSortArr));
        System.out.println("Insertion Sort Result: " + Arrays.toString(insertionSortArr));
        System.out.println("Arrays.sort() Result: " + Arrays.toString(arraySortArr));
    }
}
