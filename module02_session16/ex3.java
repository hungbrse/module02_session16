package module02_session16;

import java.util.Scanner;

public class ex3 {


        private static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // B1: Tạo mảng cho sẵn phần tử
            int[] arr = {12, 34, 7, 56, 90, 23, 45, 78, 91, 10};

            // In mảng ra màn hình
            System.out.print("Mảng số nguyên: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // B2: Lấy số cần tìm từ Scanner
            System.out.print("Nhập số cần tìm: ");
            int target = scanner.nextInt();

            // B3: Duyệt mảng để tìm ra vị trí xuất hiện của phần tử cần tìm
            int index = linearSearch(arr, target);

            // In kết quả tìm kiếm
            if (index != -1) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí: " + index);
            } else {
                System.out.println("Không tìm thấy số " + target + " trong mảng.");
            }

            scanner.close();

    }
}
