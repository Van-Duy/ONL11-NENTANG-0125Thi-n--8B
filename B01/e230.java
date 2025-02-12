package B01;

public class e230 {
    public static void main(String[] args) {
        double radius = 9;
  
        double Perimeter = radius * 2 * Math.PI;
        // double Area = radius * radius * Math.PI;
        double Area = Math.pow(radius, 2) * Math.PI;

        System.out.printf("Perimeter: %.2f \n", Perimeter);
        System.out.printf("Area: %.2f", Area);
    }
    
}
