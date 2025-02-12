package B05;

public class e107 {
    public static void main(String[] args) {
        int number = 14;
        String outPut = " ";

        // In tiêu đề
        System.out.printf("Ước số chẵn của %d là: ", number);

        // Duyệt từ 2 đến number để tìm các ước số chẵn
        // for (int i = 2; i <= number; i += 2) {
        //     if (number % i == 0) {
        //         System.out.printf("%d ", i);
        //     }
        // }
        int index = 0;
        while (index <= number) {
            
            index+=2;
        }

        System.out.println();
    }
}
