package module02_session16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex12 {

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    private static int binarySearchDescending(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = getArr();
        System.out.println("Mảng giảm dần:");
        System.out.println(Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên cần tìm: ");
        int target = scanner.nextInt();
        scanner.close();

        int result = binarySearchDescending(arr, target);

        if (result != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí: " + result);
        } else {
            System.out.println("Số " + target + " không có trong mảng.");
        }
    }
}
