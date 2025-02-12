package B01;

public class e29 {
    public static void main(String[] args) {
        int numberOne = 6;
        int numberTwo = 0;

        String math = ":";
        int result = 0;
        boolean isError = false;
        String errCode = "";
       
        switch (math) {
            case "-":
                result = numberOne - numberTwo;
                break;
            case "+":
                result = numberOne + numberTwo;
                break;
            case "x":
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
            case ":":
                if(numberTwo == 0) {
                   isError = true;
                   errCode = "Không thể chia cho 0";
                }else {
                    result = numberOne + numberTwo;
                }
                break;
            default:
                isError = true;
                errCode = "Không thực hiện được, phép tính không hợp lệ";
                break;
        }


        if( isError == true) {
            System.err.printf("%s" , errCode);
        } else {
            System.out.printf("%d %s %d = %d \n", numberOne, math , numberTwo, result);
        }
      
    }
}
