package B07;

public class e118 {
    public static void main(String[] args) {
        int[] arrInt = { 1, 3, 6 , 0 };

        String result = " tăng dần";

        for (int i = 0; i < arrInt.length - 1; i++) {
            if (arrInt[i] > arrInt[i + 1]) {
                result = "Không tăng dần";
                break; 
            }
        }

        System.out.printf("%s\n", result);
    }
}
