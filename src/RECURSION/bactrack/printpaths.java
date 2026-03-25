package RECURSION.bactrack;

public class printpaths {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        path(1 , 1 , row , col , "") ;
    }
    static void path(int sr , int sc , int row , int col , String s){
        if(sr>row || sc>col) return;
        if(sr==row && sc==col){
            System.out.println(s);
            return;
        }
        path(sr+1 , sc , row , col , s+'D');
        path(sr , sc+1 , row , col , s+'R');
    }
}
