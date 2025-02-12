package B02;

public class e162 {
    public static void main(String[] args) {
        int X = 8, Y = 10, Z = 21;
        String result = "False";

        if (X + Y > Z && X + Z > Y && Y + Z > X) {
           result = "TRUE";
        }



        System.out.println(result);
    }

}
