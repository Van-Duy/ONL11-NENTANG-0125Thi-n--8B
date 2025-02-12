package B05;

public class e06 {
    public static void main(String[] args) {
        int height = 5; // Số dòng của tháp

        String shape = "";
        String record = "";

        for (int i = 1; i <= height; i++) {
            record = "+".repeat(i);
            shape += record + "\n";
        }


        System.out.println(shape);
    }
}
