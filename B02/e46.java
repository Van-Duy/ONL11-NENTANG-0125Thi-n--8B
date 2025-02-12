package B02;

public class e46 {
    public static void main(String[] args) {
        
        int timeDoing = 4;
        int totalLine = 50;

        int priceLine = 5;

        if(totalLine <= 10) {
            priceLine = 1;
        }else if (totalLine <= 20) {
            priceLine = 2;
        }

        int salary  = (timeDoing * 20) - priceLine;

        System.out.printf("Salary: %d $ \n" , salary);
    }
}
