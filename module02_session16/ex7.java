package module02_session16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex7 {

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    // Hàm tìm kiếm nhị phân để tìm vị trí đầu tiên lớn hơn hoặc bằng giá trị
    private static int binarySearchLowerBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    // Hàm tìm kiếm nhị phân để tìm vị trí cuối cùng nhỏ hơn hoặc bằng giá trị
    private static int binarySearchUpperBound(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1: Tạo mảng và in ra mảng số nguyên đã sắp xếp đảo ngược
        Integer[] arr = getArr();
        System.out.println("Mảng số nguyên đã sắp xếp đảo ngược: " + Arrays.toString(arr));

        // B2: Lấy 2 số min và max từ bàn phím
        System.out.print("Nhập số min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập số max: ");
        int max = scanner.nextInt();

        // B3: Duyệt mảng để tìm số trong khoảng từ min đến max
        int lowerBound = binarySearchLowerBound(arr, min);
        int upperBound = binarySearchUpperBound(arr, max);

        // B4: In ra số lượng số tìm thấy và chi tiết số đó
        if (lowerBound >= 0 && upperBound < arr.length && lowerBound <= upperBound) {
            System.out.println("Các số trong khoảng [" + min + ", " + max + "]: ");
            for (int i = lowerBound; i < upperBound; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Tổng số lượng số tìm thấy: " + (upperBound - lowerBound));
        } else {
            System.out.println("Không tìm thấy số nào trong khoảng [" + min + ", " + max + "].");
        }

        scanner.close();
    }
}
