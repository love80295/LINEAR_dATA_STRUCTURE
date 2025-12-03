package ElemntarySheet4;
import java.util.*;
public class NambierNumber {
    public static void main(String[] args) {

    }
    static int ndjf(String input1){
        int[]arr = new int[input1.length()];
        for(int i = 0 ; i<input1.length() ; i++){
            arr[i] = input1.charAt(i) -'0';
        }
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            sum = arr[i];
            i++;
            if(sum%2!=0){
                while(sum%2!=0 && i<arr.length){
                    sum+=arr[i];

                    i++;
                }

            }else{
                while(sum%2==0 && i<arr.length){
                    sum+=arr[i];
                    i++;
                }

            }
            list.add(sum + "");
        }

        String result = String.join("", list);
        return Integer.parseInt(result);
    }
}
