package B03;

public class e52 {
    public static void main(String[] args) {
        int yourNumber = 1234;

        // String result = String.valueOf(yourNumber);

        // int length = result.length();
        // System.out.printf("%d digits \n" , length);
        int count = 0;
        
        while (yourNumber > 0) {
            yourNumber /=  10;
            count++;
        }

        System.out.printf("%d digits \n" , count);
        
    }
}


