package module02_session16;

import java.util.Arrays;
import java.util.Scanner;

public class ex9 {

    private static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] == value) {
            return middle;
        }

        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int result = binarySearch(array, 0, array.length - 1, value);

        if (result == -1) {
            System.out.println("Giá trị không có trong mảng.");
        } else {
            System.out.println("Giá trị được tìm thấy tại vị trí: " + result);
        }

        scanner.close();
    }
}
