package B06;

public class e88 {
    public static void main(String[] args) {
        String phone = "0764585578"; // Thay đổi số điện thoại tại đây
        // phone = phone.replace(".", ""); // Xóa dấu chấm nếu có


        


        String result = "No";

        for (int i = 1; i < phone.length() - 3; i++) {
            if(
                phone.charAt(i) == phone.charAt(i + 1) &&
                phone.charAt(i) == phone.charAt(i + 2) &&
                phone.charAt(i) == phone.charAt(i + 3)
            ) { 
                result = "yes";
                break;
            }
        }

        System.out.printf("%s\n", result);
    }
}
