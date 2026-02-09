package RECURSION.basicQuestion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(power(n , 0));
    }
    static boolean power(int n , int p){
        if(Math.pow(2,p)==n) return true;
        if(Math.pow(2,p)>n) return false;
        return power(n , p+1);
    }
}
