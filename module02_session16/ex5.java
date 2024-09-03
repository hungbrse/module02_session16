package module02_session16;

import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }

    private static int binarySearchLowerBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private static int binarySearchUpperBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] arr = getArr();
        System.out.println("Mảng số nguyên đã sắp xếp: " + Arrays.toString(arr));

        // B2: Lấy 2 số min và max từ bàn phím
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        // B3: Duyệt mảng để tìm số trong khoảng từ min đến max
        int lowerBound = binarySearchLowerBound(arr, min);
        int upperBound = binarySearchUpperBound(arr, max);

        // In ra số lượng số tìm thấy và chi tiết số đó
        if (lowerBound <= upperBound && lowerBound < arr.length && upperBound >= 0) {
            System.out.println("Các số trong khoảng [" + min + ", " + max + "]: ");
            for (int i = lowerBound; i <= upperBound; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Tổng số lượng số tìm thấy: " + (upperBound - lowerBound + 1));
        } else {
            System.out.println("Không tìm thấy số nào trong khoảng [" + min + ", " + max + "].");
        }

        scanner.close();
    }
}
