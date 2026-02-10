package RECURSION.Strings;

public class SkipStrung {
    public static void main(String[] args) {
        String s = "apple";
        System.out.println(skip(s , "" , 0));
    }
    static String skip(String s , String ans , int i){
        if(i==s.length()){
            return ans;
        }
        if(s.length()-i<5){
            return skip(s , ans+s.substring(i , i+1) , i+1);
        }
        if(s.substring(i , i+5).equals("apple")){
            return skip(s , ans , i+5);
        }
        return skip(s , ans+s.substring(i,i+1) , i+1 );
    }
}
