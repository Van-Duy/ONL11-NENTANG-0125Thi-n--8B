package B07;

import java.util.Arrays;

public class e113 {
    public static void main(String[] args) {
        int[] arrInt = { 2, -224, -16, 2 };

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Math.abs(arrInt[i]); 
        }

        System.out.printf("%s", Arrays.toString(arrInt));
    }
}
