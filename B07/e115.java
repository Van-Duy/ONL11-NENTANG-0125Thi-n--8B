package B07;

import java.util.Arrays;

public class e115 {
    public static void main(String[] args) {
        int[] arrInt = {2,-224,-16,2,3};
        
        // Đếm số phần tử không âm
        int count = 0; // 3
        for (int num : arrInt) {
            if (num >= 0) {
                count++;
            }
        }
        // Tạo mảng mới chứa phần tử không âm
        int[] newArr = new int[count]; // [0,0,0]
        
        int index = 0;
        for (int num : arrInt) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }

        
        System.out.printf("%s\n", Arrays.toString(newArr));
    }
}
