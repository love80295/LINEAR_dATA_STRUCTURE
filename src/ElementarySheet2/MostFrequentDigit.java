package ElementarySheet2;

import java.util.ArrayList;

public class MostFrequentDigit {
    public static void main(String[] args) {

    }
    static int vfsnk(int input1 , int input2 , int input3 , int input4){
        ArrayList<Integer> list = new ArrayList<>();
        while(input1!=0 || input2!=0 || input3!=0 || input4!=0){
            int rem1 = input1%10;
            list.add(rem1);
            int rem2 = input2%10;
            list.add(rem2);
            int rem3 = input3%10;
            list.add(rem3);
            int rem4 = input4%10;
            list.add(rem4);
            input1 = input1/10;
            input2 = input2/10;
            input3 = input3/10;
            input4 = input4/10;
        }
        int count = 0;
        int suncount = 0;
        int val = 0;
        for(int i = 0 ; i<list.size() ; i++){
            for(int j = i+1 ; j<list.size() ; j++){
                if(list.get(i)==list.get(j)){
                    suncount++;
                }
                if(suncount>count){
                    count = suncount;
                    val = list.get(i);
                }
            }
            suncount = 0;
        }
        return val;
    }
}
