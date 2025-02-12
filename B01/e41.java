package B01;

public class e41 {
    public static void main(String[] args) {
        int one = 9;
        int two = 3;

        int cong = one + two;
        int tru = one + two;
        int nhan = one * two;
        float chia = (float) one / two;
        int phandu = one % two;

        if(one == 0 & two == 0) {
            
        }

        System.out.printf("%d + %d = %d \n", one, two, cong);
        System.out.printf("%d - %d = %d \n", one, two, tru);
        System.out.printf("%d x %d = %d \n", one, two, nhan);
        System.out.printf("%d : %d = %.2f \n", one, two, chia);
        System.out.printf("%d %s %d = %d \n", one, "%", two, phandu);
    }
}
