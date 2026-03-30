package RECURSION.bactrack;
import java.util.*;
public class NqueenPractise {
    public static void main(String[] args) {
        int n = 4;
        char[][]board = new char[4][4];
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board.length ; j++){
                board[i][j] = '.';
            }
        }
        queen(board , 0);
    }
    static void queen(char[][]board , int row){
        int n = board.length;
        if(row==n){
            for(int  i = 0 ; i<board.length ; i++){
                for(int j = 0 ; j<board.length ; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j = 0 ; j<board.length ; j++){
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                queen(board , row+1);
                board[row][j] = '.';
            }
        }

    }
    static boolean isSafe(char[][]board , int row , int col){
        int n = board.length;
        // check row
        for(int j = 0 ; j<n ; j++){
            if(board[row][j]=='Q') return false;
        }
        // check column
        for(int i = 0 ; i<n ; i++){
            if(board[i][col]=='Q') return false;
        }
        // 1st diagonal
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        // 2nd diagonal;
        i = row ;
        j = col ;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        // 3rd diagonal
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // 4th diagonal
        i = row ;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
}
