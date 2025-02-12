package B02;

public class e234 {
    public static void main(String[] args) {
        int yourNumber = 0;


        if (yourNumber == 0) {
            System.out.printf("Số 0");
            return;
        }
        
        String reOne = "dương";
        if (yourNumber < 0) reOne = "âm";

        System.out.printf("Số nguyên %s", reOne);

    }

}
