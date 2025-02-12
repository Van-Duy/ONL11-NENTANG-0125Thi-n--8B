package B05;

public class e99 {
    public static void main(String[] args) {
        int n = 3; // Giá trị cố định của n
        String expression = ""; // Chuỗi biểu thức
        long sum = 0;

        // Tính tổng và tạo chuỗi biểu thức
        for (int i = 1; i <= n; i++) {
            long power = (long) Math.pow(n, 2 * i);
            sum += power;
            expression += " + " + n + "^" + (2 * i) ;
        }

        expression = expression.substring(3, expression.length() );

        System.out.printf("%s = %d \n", expression, sum);
    }
}
