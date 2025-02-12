package B06;

public class e15 {
    public static void main(String[] args) {
        int height = 5; // Giá trị cố định
        String shape = "";

        for (int i = 1; i <= height; i++) {
            // shape += "#".repeat(height - i) + String.valueOf(i).repeat(2 * i - 1) + "#".repeat(height - i) + "\n";
            String around = "#".repeat(height - i);
            // String center = String.valueOf(i).repeat(2 * i - 1);
            String center = (i + "").repeat(2 * i - 1);
            String result = around + center + around;
            shape += result + '\n';
        } // repeat đếm
        System.out.printf("%s", shape);
    }
}
