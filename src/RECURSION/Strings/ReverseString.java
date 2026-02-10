package RECURSION.Strings;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(s("hello" , 0 , ""));
    }
    static String s(String str ,  int index , String nstr){
            if(index==str.length()){
                return nstr;
            }
            int n = (str.length()-1) - index;
            return s(str , index+1 , nstr+str.charAt(n));

    }
}
