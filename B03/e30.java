package B03;

public class e30 {
    public static void main(String[] args) {
        int start = 11;
        int end = 10;

        String result = "";

        for (int i = start + 1; i < end; i++) {
            if (i % 2 == 0) result += i + " ";
        }

        if(result.length() == 0) result = "Khong co";
        
        System.out.println(result);

    }
}


