package ElementarySheet1;

public class sum_of_last_digits {
    public static void main(String[] args) {

    }
    static int lastdigit(int input1 , int input2){
        if(input1<0) input1 = input1*-1;
        if(input2<0) input2 = input2*-1;
        int n1,n2;
        n1 = input1%10;
        n2 = input2%10;
        return n1+n2;
    }
}

