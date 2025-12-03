package ElementarySheet3;

public class finsum {
    public static void main(String[] args) {

    }
    static int hjd(int input1){
        String num = input1 + "";
        int[]arr = new int[num.length()];
        for(int i = 0 ; i<num.length() ; i++){
            arr[i] = num.charAt(i) -'0';
        }
        int finsum = 0;
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i ; j<arr.length ; j++ ){
                sum+=arr[j];
            }
            finsum += sum;
            sum = 0;
        }
        return finsum;
    }
}
