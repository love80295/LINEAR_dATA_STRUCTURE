package RECURSION.basicQuestion;

public class reduceToZero {
    public static void main(String[] args) {
        System.out.println(steps(14 , 0));
    }
    static int steps(int n , int steps){
        if(n==0) return steps;
        if(n%2==0){
           return  steps(n/2  , steps+1);
        }
        return steps(n-1 , steps+1);
    }
}
