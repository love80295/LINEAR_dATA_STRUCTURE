package ElementarySheet3;

public class decreasingSequence {
    public static void main(String[] args) {
         int[]arr = {11,3,1,4,7,8,12,2,3,7};
         // o1 -> no. of decresing sequence;
        // 02 -> highest number of sequence ;
        int o1 = 0 , o2 = 0;
        int freq = 1;
        for(int i = 0 ; i<arr.length-1 ; i++ ){
            if(arr[i]>arr[i+1]){

                freq++;
            }else {
                if(freq>1) o1++;
                if(freq>o2){
                    o2 = freq;
                }
                freq = 1;
            }
        }
        if(freq>1) o1++;
        if(freq>o2) o2 = freq;

        System.out.println(o1);
        System.out.println(o2);
    }

}
