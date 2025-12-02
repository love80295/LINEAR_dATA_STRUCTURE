package ElementarySheet2;

public class StringCode {
    public static void main(String[] args) {

    }
    static int bdfv(String input1){
        int sum = 0;
        String[]arr = input1.split(" ");
        for(int i = 0 ; i<arr.length ; i++){
            String str = arr[i];
            sum = sum + str.length();
        }
        int sum1 = 0;
        while(sum!=0){
            int rem = sum%10;
            sum1 = sum1 + rem;
            sum = sum/10;
        }
        return sum1;
    }
}
