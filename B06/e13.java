package B06;


public class e13 {

    public static void main(String[] args) {
            int height = 6; // Giá trị cố định

            String shape = "";
            String record = "";

            for (int i = 1; i <= height; i++) {
                // record = listNumber1ToN(i);
                shape += record + "\n";
            }
            System.out.printf("%s", shape);
        }
}