package ElementarySheet1;
import java.util.*;
public class exct_multiple {
    public static void main(String[] args) {

    }
    static int sdbvk(int input1 , int input2){
        if(input1<0) input1 = input1*-1;
        if(input1==0 || input2==0){
            return 3;
        }
        if(input1%input2==0){
            return 2;
        }else{
            return 1;
        }
    }
}
