package B02;

public class e79 {
    public static void main(String[] args) {
        int year = 2048;
        int month = 7;
        int days = 0;
        boolean err = false;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: // Tháng 31 ngày
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11: // Tháng 30 ngày
                days = 30;
                break;
            case 2: // Năm nhuận (search gg)
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                err = true;
                return;
        }

        if(err) {
            System.out.println("Tháng không hợp lệ!");
        }else {
            System.out.printf("Tháng %d năm %d có %d ngày", month, year, days);
        }
    }
}
