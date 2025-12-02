package ElementarySheet2;

public class AdditionStrings {
    public static void main(String[] args) {

    }
    static String bdshj(String input1 , String input2){
        long num1 = Long.parseLong(input1);
        long num2 = Long.parseLong(input2);
        long ans = num1+num2;
        String s = String.valueOf(ans);
        return s;
    }
}
