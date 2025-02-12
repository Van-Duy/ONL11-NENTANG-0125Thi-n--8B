package B06;

public class e18 {
    public static void main(String[] args) {
        int height = 3; // Kích thước cố định của chữ Z
        String shape = "";
        String character = "=";
        shape = character.repeat(height) + "\n";
        for (int i = 2; i < height; i++) {
            shape += " ".repeat(height - i - 1) + character + "\n";
           
        }
        shape += character.repeat(height);
        System.out.printf("%s", shape);
    }
}
