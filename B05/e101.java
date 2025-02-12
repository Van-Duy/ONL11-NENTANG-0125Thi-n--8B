package B05;

public class e101 {
    public static void main(String[] args) {
        int number = 10; // Giá trị cố định của number

        System.out.printf("Các ước số của %d là: ", number);

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Kiểm tra nếu number chia hết cho i
                System.out.print(i);
                if (i < number) {
                    System.out.print(", ");
                }
            }
        }
    }
}
