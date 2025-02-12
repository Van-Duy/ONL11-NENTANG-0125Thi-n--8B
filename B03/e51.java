package B03;

public class e51 {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 1; i <= 10; i++) {
            if(i == 1) {
                continue;
            }
            System.out.printf("%d x %d = %d \n", i, number, i * number);
            break;
        }
    }
}


