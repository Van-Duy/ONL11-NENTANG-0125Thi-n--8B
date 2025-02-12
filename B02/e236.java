package B02;

public class e236 {
    public static void main(String[] args) {
        double score = 9.3;
        String xepLoai;

        if (score >= 9.0) {
            xepLoai = "Xuất sắc";
        } else if (score >= 8.0) {
            xepLoai = "Giỏi";
        } else if (score >= 5.5) {
            xepLoai = "Khá";
        } else if (score >= 4.0) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }

        System.out.printf("Học sinh xếp loại: %s", xepLoai);
    }

}
