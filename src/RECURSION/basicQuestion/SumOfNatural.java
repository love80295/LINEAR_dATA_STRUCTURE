package RECURSION.basicQuestion;

public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(sum(4 , 1 ,  0 ));
    }
    static int sum(int n , int p , int sum ){
        if(p>n) return sum;
        int sum1 = p;
        sum1 = p+sum;
        return sum(n , p+1 , sum1);
    }
}
