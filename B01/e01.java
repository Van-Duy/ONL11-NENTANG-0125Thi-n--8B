package B01;

public class e01 {
    public static void main(String[] args) {
        int numberOne = 1;
        int numberTwo = 5;
        int numberThree = 19;

        int maxNumber = Math.max(Math.max(numberOne, numberTwo), numberThree);
        System.err.printf("Max %d, %d, %d: %d" , numberOne , numberTwo , numberThree , maxNumber);

    }
}