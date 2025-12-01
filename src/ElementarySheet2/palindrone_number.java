package ElementarySheet2;

public class palindrone_number {
    public static void main(String[] args) {

    }
    static int pal(int input1){
        int n = input1;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }
        if(input1==sum){
            return 2;
        }else{
            return 1;
        }
    }
}
