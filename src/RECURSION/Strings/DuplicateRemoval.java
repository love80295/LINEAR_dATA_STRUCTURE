package RECURSION.Strings;

public class DuplicateRemoval {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaa";
        String nstr  = new String();
        nstr = nstr+s.charAt(0);
        System.out.println(ns(s , nstr , 1));
    }
    static String ns(String str , String nstr , int index){
        if(index==str.length()){
            return nstr;
        }
        char curr = str.charAt(index);
        char pre = str.charAt(index-1);
        if(curr!=pre){

            return ns(str , nstr+curr , index+1);
        }
        return ns(str , nstr , index+1);

    }
}
