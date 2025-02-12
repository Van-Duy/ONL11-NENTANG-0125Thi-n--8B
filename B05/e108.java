package B05;

public class e108 {
    public static void main(String[] args) {
        int number = 27;

        // Tìm ước số lẻ lớn nhất (ngoại trừ number)
        int maxOddDivisor = -1; // Giá trị mặc định nếu không tìm thấy

        for (int i = number - 1; i >= 1; i--) { // Duyệt ngược từ number - 1 về 1
            if (number % i == 0 && i % 2 != 0) { // Kiểm tra ước số và tính lẻ
                maxOddDivisor = i;
                break; // Tìm thấy số lẻ lớn nhất thì dừng lại
            }
        }

        if (maxOddDivisor != -1) {
            System.out.printf("Ước số lẻ lớn nhất của %d là %d\n", number, maxOddDivisor);
        } else {
            System.out.printf("%d không có ước số lẻ.\n", number);
        }
    }
}
