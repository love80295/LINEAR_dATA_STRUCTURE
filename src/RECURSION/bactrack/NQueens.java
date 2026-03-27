package RECURSION.bactrack;
import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        int n = 6;
        char[][] board = new char[n][n];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                board[i][j] = 'X';
            }
        }
        queen(board , 0);

    }
    static void queen(char[][] board , int row){
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
        for(int j = 0 ; j<n ; j++ ){
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                queen(board , row+1);
                board[row][j] = 'X'; // bactracking

        }
    }
}
static boolean isSafe(char[][]board , int row , int col){
        // check row
    int n = board.length;
    for(int j = 0 ; j<n ; j++){
        if(board[row][j]=='Q') return false;
    }
    // check col
    for(int i = 0 ; i<n ; i++){
        if(board[i][col]=='Q') return false;
    }
    // check 1st diagonal
    int i = row;
    int j = col;
    while(i>=0 && j<n){
        if(board[i][j]=='Q') return false;
        i--;
        j++;
    }
    // check 2nd diagonal;
    i = row;
    j = col;
    while(i>=0 && j>=0){
        if(board[i][j]=='Q') return false;
        i--;
        j--;
    }
    // check 3rd diagonal;
    i = row;
    j = col;
    while(i<n && j<n){
        if(board[i][j]=='Q') return false;
        i++;
        j++;
    }
    // check 4th diagonal;
    i = row;
    j = col;
    while(i>n && j>=0){
        if(board[i][j]=='Q') return false;
        i++;
        j--;
    }
    return true;
}
}
