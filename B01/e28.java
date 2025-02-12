package B01;

public class e28 {

    public static void main(String[] args) {

        int totalSale = 90;

        final double hoahongOne = 0.05;
        final double hoahongTwo = 0.1;
        final double hoahongThree = 0.2;

        double hoahong = hoahongThree;

        if (totalSale <= 100) {
            hoahong = hoahongOne;
        } else if (totalSale <= 300) {
            hoahong = hoahongTwo;
        }
        double result = hoahong * totalSale;
        // System.out.printf("hoa hong : %f" , result );
        System.out.println("hoa hong :" + result );
    }
}