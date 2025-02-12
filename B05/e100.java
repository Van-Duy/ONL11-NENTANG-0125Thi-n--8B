package B05;

public class e100 {
    public static void main(String[] args) {
        int number = 25; // Giá trị cố định của number
        String result = "";
        int n = 0;
        int i = 0;

        // for (int i = 0; number * i < 100; i++) {
        //     n = number * i;
        //     result += n + " ";
        // }
        while (number * i < 100) {
            n = number * i;
            result += n + " ";
            i++;
        }

        result = result.substring(0, result.length() - 1);

        System.out.printf("Bội nhỏ hơn 100 của %d là: %s \n", number , result);

    }
}
