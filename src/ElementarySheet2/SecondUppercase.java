package ElementarySheet2;
import java.util.*;
public class SecondUppercase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String l = sc.nextLine();
       String ans = bnsdf(l);
        System.out.println(ans);

    }
    static String bnsdf(String input1){
        String[]str = input1.split(" ");
        if(str.length<2) return "LESS";
        String str2 = str[1];
        str2 = str2.toUpperCase();

        return str2;
    }
}
