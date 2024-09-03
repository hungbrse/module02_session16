package module02_session16;

import java.util.Arrays;

public class ex1 {

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.println("Mảng số nguyên ngẫu nhiên: " + Arrays.toString(arr));

        int max = findMax(arr);

        System.out.println("Số lớn nhất trong mảng: " + max);
    }
}
