package B05;

public class e105 {
    public static void main(String[] args) {
        int x = 25;
        int y = 10;
        // int min = Math.min(x, y);
        int max = Math.max(x, y);
        int result = 0;
        // int ucln = 1; // khởi tạo ucln là 1
        // Công thức UCLN
        // for (int i = 1; i <= min; i++) {
        //     if (x % i == 0 && y % i == 0) {
        //         ucln = i;
        //     }
        // }
        // int lcm = (x * y) / ucln;

        for (int i = max; i < x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                result = i;
                break;
            }
        }
        System.out.printf("BCNN của %d và %d là %d\n", x, y, result);
    }
}
