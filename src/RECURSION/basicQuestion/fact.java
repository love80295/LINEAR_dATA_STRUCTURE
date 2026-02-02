package RECURSION.basicQuestion;

public class fact {
    public static void main(String[] args) {
       int n = fact(5);
        System.out.println(n);
    }
    static int fact(int n){
        if(n==1) return n;
        return n*fact(n-1);
    }
}
