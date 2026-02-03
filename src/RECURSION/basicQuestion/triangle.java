package RECURSION.basicQuestion;

public class triangle {
    public static void main(String[] args) {
    int[]arr = {1,2,3,4,5};
    int [] brr = newtri(arr  );
        System.out.println(brr[0]);
    }
    static int[] newtri(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int[]brr = new int[arr.length-1];
        for(int i = 0 ; i<brr.length; i++ ){
            brr[i] = arr[i]+ arr[i+1];
        }
        return newtri(brr);

    }

}
