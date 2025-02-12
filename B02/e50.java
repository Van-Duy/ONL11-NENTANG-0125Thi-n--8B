package B02;

public class e50 {
    public static void main(String[] args) {
        int yourNumber = -4;

        String strOne = "dương";
        String strTwo = "chẵn";
   
        if(yourNumber < 0) strOne = "âm";
        if(yourNumber % 2 != 0) strOne = "le";

        System.out.printf("Số nguyên %s %s \n" , strOne , strTwo);
    
    }
}
