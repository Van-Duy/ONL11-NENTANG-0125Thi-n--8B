package B05;

public class e102 {
    public static void main(String[] args) {
        int[] arrInt = { 14, 12, 3, 5, 6 };
        int number = 14;

        String result = "Không tồn tại";
        // Duyệt qua mảng arrInt để kiểm tra ước số
        // for (int i = 0; i < arrInt.length; i++) {
        //     if (number % arrInt[i] == 0) {
        //         result = "Tồn tại";
        //         break; // Dừng vòng lặp khi tìm thấy ước
        //     }
        // }
        for (int i : arrInt) {
             if (number % i == 0) {
                result = "Tồn tại";
                break; // Dừng vòng lặp khi tìm thấy ước
            }
        }

        System.out.printf("%s \n", result);
    }
}
