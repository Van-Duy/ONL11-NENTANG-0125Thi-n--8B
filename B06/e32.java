package B06;

public class e32 {
    public static void main(String[] args) {
        int[] arrInt = {1, 3, 5, 3, 3, 3, 3}; // Thay đổi mảng tại đây
     
        int sum = 0, count = 0 ;
        String str = "" ;

        for (int i = 1; i < arrInt.length; i += 2) { // Duyệt chỉ số lẻ (1, 3, 5, ...)
            if (arrInt[i] % 2 == 0) { // Kiểm tra số chẵn
                str += arrInt[i] + " + ";
                sum += arrInt[i];
                count++;
            }
        }
        if(count == 0) {
             System.out.printf("Avg : 0 \n");
             return;
        } 
        double average = (count > 0) ? (double) sum / count : 0.0;
        str = str.substring(0, str.length() - 3);
        System.out.printf("Avg: (%s) / %d = %.1f \n", str, count, average);
       
    }
}
