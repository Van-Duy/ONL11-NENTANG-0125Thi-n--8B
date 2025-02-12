public class e106 {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        if (x < y) {
            System.out.printf("Không thỏa điều kiện X > Y");
            return;
        }

        String result = "";
        boolean found = false;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && i % y == 0) {
                // result
                found = true;
            }
        }
        
        if (!found) {
            System.out.printf("Không tồn tại giá trị vừa là ước của %d vừa là bội của %d \n", x, y);
        }else {
            System.out.printf("%d ", result);
        }
    }
}
