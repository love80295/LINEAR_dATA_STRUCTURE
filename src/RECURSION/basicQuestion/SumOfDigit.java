package RECURSION.basicQuestion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(234 , 0));
    }
    static int sum(int n , int sum){
        if(n==0){
            return sum;
        }
        int rem = n%10;;
        return sum(n/10 , sum+rem);
    }
}
