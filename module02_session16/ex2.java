package module02_session16;

import java.util.*;

public class ex2 {

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static boolean searchNumber(int[][] arr, int number) {
        List<Map.Entry<Integer, Integer>> positions = new ArrayList<>();
        boolean found = false;

        // Duyệt qua từng phần tử của mảng 2 chiều
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) { // Nếu tìm thấy số nhập vào
                    // Thêm vị trí (i, j) vào danh sách
                    positions.add(new AbstractMap.SimpleEntry<>(i, j));
                    found = true; // Cập nhật biến kiểm tra
                }
            }
        }

        // In ra các vị trí tìm thấy nếu có
        if (found) {
            System.out.println("Số " + number + " được tìm thấy tại các vị trí: ");
            for (Map.Entry<Integer, Integer> entry : positions) {
                System.out.println("Hàng: " + entry.getKey() + ", Cột: " + entry.getValue());
            }
        } else {
            System.out.println("Số " + number + " không được tìm thấy trong mảng.");
        }

        return found; // Trả về kết quả tìm kiếm
    }

    public static void main(String[] args) {
        // Tạo mảng 2 chiều và gán giá trị ngẫu nhiên từ hàm getArr()
        int[][] arr = getArr();

        // In mảng 2 chiều
        System.out.println("Mảng 2 chiều ngẫu nhiên: ");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        // Nhập số cần tìm từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int number = scanner.nextInt();

        // Gọi hàm tìm kiếm số và in ra kết quả
        boolean result = searchNumber(arr, number);
    }
}
