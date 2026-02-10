package RECURSION.Strings;

public class UppercaseString {
    public static void main(String[] args) {
        // 62 -97 -32
        System.out.print(geek("geekforGEEk" ,0,'a'  , 0));

    }
    static char geek(String s  ,  int index , char ch , int count){
        if(index==s.length()){
            return ch;
        }
        if(count<1){
            if(s.charAt(index)<97 && s.charAt(index)>64){
                ch = s.charAt(index);
                return geek(s , index+1 , ch , count+1);

            }
        }
        return geek(s , index+1 , ch , count);
    }
}
