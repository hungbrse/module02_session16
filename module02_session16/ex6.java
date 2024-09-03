package module02_session16;

import java.util.Arrays;
import java.util.Scanner;

public class ex6 {
    private static void insertionSort(int[] arr) {
        System.out.println("Bước đầu tiên: " + Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            System.out.println("Sau khi chèn phần tử " + key + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        insertionSort(arr);

        scanner.close();
    }
}
