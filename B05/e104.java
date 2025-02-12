package B05;

public class e104 {
    public static void main(String[] args) {
        int x = 4000;
        int y = 8000;
        int min = Math.min(x, y);
        int ucln = 1; // !=0

        // for (int i = 1; i <= min; i++) {
        //     if (x % i == 0 && y % i == 0) {
        //         ucln = i;
        //     }
        // }

        for (int i = min; i >= 0; i--) {
            if (x % i == 0 && y % i == 0) {
                ucln = i;
                break;
            }
        }

        System.out.printf("UCLN của %d và %d là %d\n", x, y, ucln);
    }
}
