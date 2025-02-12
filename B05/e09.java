package B05;

public class e09 {
    public static void main(String[] args) {
        int height = 7;

        String shape = "";
        String record = "";

        for (int i = 1; i <= height; i++) {
            record = "=".repeat(height - i) + "+".repeat(i);
            shape += record + "\n";
        }
        System.err.println(shape);
    }
}
