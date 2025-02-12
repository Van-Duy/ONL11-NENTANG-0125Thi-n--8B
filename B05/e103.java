package B05;

public class e103 {
    public static void main(String[] args) {
        int[] arrInt = { 14, 12, 3, 5, 30 };
        int number = 5;

        boolean exists = false;
        String outPut = "Không tồn tại";
        // Duyệt qua mảng arrInt để kiểm tra ước số
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % number == 0 && arrInt[i] % (number + 1) == 0) {
                exists = true;
                outPut = "Tồn tại";
                break; // Dừng vòng lặp khi tìm thấy ước
            }
        }
        System.out.printf("%s", outPut);
    }
}
