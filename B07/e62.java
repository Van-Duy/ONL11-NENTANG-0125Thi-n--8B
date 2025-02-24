package B07;

public class e62 {
    public static void main(String[] args) {
        String str = "@$7-bc";

        String result = "false";

        for (char ch : str.toCharArray()) { // Duyệt từng ký tự
            if (Character.isDigit(ch)) { // Kiểm tra nếu ký tự là số
                result = "true";
                break;
            }
        }

        System.out.printf("%s\n", result);
    }
}
