package RECURSION.bactrack;
import java.util.*;
public class K_Knights {
    public static int max = -1;
    public static void main(String[] args) {
        int n = 3;
        char [][] board = new char[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        knights(board , 0 , 0 , 0);
    }
    static boolean isSafe(char[][]board , int row ,  int col){
        int n = board.length;
        // check 2up 1 right
        int i = row - 2;
        int j = col+1;
        if((i>=0 && j<n) && board[i][j]=='K') return false;
        // check 2up 1 left
        i = row - 2;
        j = col-1;
        if((i>=0 && j>=0) && board[i][j]=='K') return false;
        // check 2down 1 right
        i = row + 2;
        j = col+1;
        if((i<n&& j<n) && board[i][j]=='K') return false;
        // check 2down 1 left
        i = row + 2;
        j = col-1;
        if((i<n&& j>=0) && board[i][j]=='K') return false;
        // check 2 right  1 up
        j = col+2;
        i = row-1;
        if((i>=0 && j<n) && board[i][j]=='K') return false;
        // check 2 right  1 down
        j = col+2;
        i = row+1;
        if((i<n && j<n) && board[i][j]=='K') return false;
        // check 2 left  1 up
        j = col-2;
        i = row-1;
        if((i>=0 && j>=0) && board[i][j]=='K') return false;
        // check 2 left 1 down
        j = col-2;
        i = row+1;
        if((i<n && j>=0) && board[i][j]=='K') return false;
        return true;
    }
    static void knights(char[][]board , int row , int col , int num){
        int n = board.length;
        if(row==n){
            for(int i = 0 ; i<n ; i++){
                for(int j = 0 ; j<n ; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
       else if(isSafe(board , row , col)){
            board[row][col] = 'K';
            if(col!=n-1) knights(board , row , col+1 , num+1);
            else knights(board , row+1 , 0 , num+1);
            board[row][col] = '.';
        }

            if(col!=n-1) knights(board , row , col+1 , num);
        else knights(board , row+1 , 0 , num);

    }
}
