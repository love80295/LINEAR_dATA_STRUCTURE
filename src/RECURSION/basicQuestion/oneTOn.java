package RECURSION.basicQuestion;

public class oneTOn {
    public static void main(String[] args) {
    int[]arr = {2,2,3,4,5,5,6,7};
    int target = 4;
     int n = binery(arr , target);
        System.out.println(n);
    }
    static int binery(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end){
            int mid = start +(end - start)/2;
            if(arr[mid]>target){
                res = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return res;

    }

}
