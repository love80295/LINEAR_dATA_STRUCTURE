package ElementarySheet1;

public class number_of_even {
    public static void main(String[] args) {

    }
    static int djf(int input1 , int input2 , int input3 , int input4 , int input5){
        int n = 0;
        if(input1%2==0) n++;
        if(input2%2==0) n++;
        if(input3%2==0) n++;
        if(input4%2==0) n++;
        if(input5%2==0) n++;
        return n;
    }
}
