package RECURSION.basicQuestion;

public class prime {
    public static void main(String[] args) {
        System.out.println(prime(144,2));
    }
    static boolean prime(int n , int p){
        if(p==n){
            return true;
        }
        return n%p!=0 && prime(n , p+1);
    }
}
