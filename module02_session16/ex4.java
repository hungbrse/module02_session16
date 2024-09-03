package module02_session16;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // B1: Tạo mảng cho sẵn phần tử random theo thứ tự tăng dần
        int[] arr = {2, 5, 7, 12, 15, 18, 22, 25, 28, 30, 34, 37, 40, 45, 47, 50};

        // In mảng ra màn hình
        System.out.println("Mảng số nguyên đã sắp xếp: " + Arrays.toString(arr));

        // B2: Lấy số cần tìm từ Scanner
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        // B3: Tìm ra vị trí xuất hiện của phần tử cần tìm
        int index = binarySearch(arr, target);

        // In kết quả tìm kiếm
        if (index != -1) {
            System.out.println("Số " + target + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }

        scanner.close();
    }
}
