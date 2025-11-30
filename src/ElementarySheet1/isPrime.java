package ElementarySheet1;

public class isPrime {
    public static void main(String[] args) {

    }
    static int hjk(int input1){
        int flag = 1;
        for(int i = 2 ; i<= input1 ; i++){
            if(input1%i==0){
                flag++;
            }
        }
        if(flag==2){
            return 2;
        }else{
            return 1;
        }
    }
}
