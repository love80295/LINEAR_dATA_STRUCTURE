package RECURSION.basicQuestion;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        System.out.println(linear(arr , 0 , 7));
    }
    static boolean linear(int[]arr , int index , int target){
        if(arr[index]==target){
            return true;
        }
        if(index==arr.length-1){
            return false;
        }
        return  linear(arr , index+1 , target);
    }
}
