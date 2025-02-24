package B07;

import java.util.Arrays;

public class e114 {
    public static void main(String[] args) {
        int[] arrInt = {1,12,3}; // Mảng đầu vào

        // Tìm giá trị lớn nhất trong mảng
        int maxVal = arrInt[0];
        for (int num : arrInt) {
            maxVal = Math.max(maxVal, num);
        }

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = maxVal;
        }

        // In kết quả bằng printf
        System.out.printf("%s\n", Arrays.toString(arrInt));
    }
}
