package RECURSION.bactrack;
import java.util.*;
public class Mazepath {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int result = tpaths(1,1,row , col);
        System.out.println(result);
    }
    static int tpaths(int str , int stc , int row , int col){
        if(str>row || stc>col) return 0;
        if(str==row && stc==col) return 1;
        int result = tpaths(str+1 , stc , row , col ) + tpaths(str , stc+1 , row , col);
        return result;
    }
}
