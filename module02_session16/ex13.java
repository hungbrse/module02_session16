package module02_session16;

import java.util.Arrays;

public class ex13 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi giá trị
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng gốc:");
        System.out.println(Arrays.toString(arr));

        int[] arrForSelectionSort = arr.clone();
        int[] arrForInsertionSort = arr.clone();
        int[] arrForBubbleSort = arr.clone();

        selectionSort(arrForSelectionSort);
        System.out.println("Mảng sau khi sắp xếp bằng Selection Sort:");
        System.out.println(Arrays.toString(arrForSelectionSort));

        insertionSort(arrForInsertionSort);
        System.out.println("Mảng sau khi sắp xếp bằng Insertion Sort:");
        System.out.println(Arrays.toString(arrForInsertionSort));

        bubbleSort(arrForBubbleSort);
        System.out.println("Mảng sau khi sắp xếp bằng Bubble Sort:");
        System.out.println(Arrays.toString(arrForBubbleSort));
    }
}
