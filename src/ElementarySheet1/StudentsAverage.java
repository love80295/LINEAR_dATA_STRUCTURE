package ElementarySheet1;
import java.util.*;
public class StudentsAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]s1 = new int[3];
        int[]s2 = new int[3];
        int[]s3 = new int[3];
        int[]s4 = new int[3];
        System.out.println("student 1 enter the marks in 3 subjects");
        for(int i = 0 ; i<s1.length ; i++){
            s1[i] = sc.nextInt();
        }
        System.out.println("student 2 enter the marks in 3 subjects");
        for(int i = 0 ; i<s2.length ; i++){
            s2[i] = sc.nextInt();
        }
        System.out.println("student 3 enter the marks in 3 subjects");
        for(int i = 0 ; i<s3.length ; i++){
            s3[i] = sc.nextInt();
        }
        System.out.print("student 4 enter the marks in 3 subjects");
        for(int i = 0 ; i<s4.length ; i++){
            s4[i] = sc.nextInt();
        }
       int sub1 = s1[0] + s2[0] + s3[0] + s4[0];
        int sub2 = s1[1] + s2[1] + s3[1] + s4[1];
        int sub3 = s1[2] + s2[2] + s3[2] + s4[2];
        System.out.println("subject 1 average :" + (sub1)/4);
        System.out.println("subject 2 average :" + (sub2)/4);
        System.out.println("subject 3 average :" + (sub3)/4);
        System.out.println("student 1 average :" + (s1[0] + s1[1] + s1[2])/3);
        System.out.println("student 2 average :" + (s2[0] + s2[1] + s2[2])/3);
        System.out.println("student 3 average :" + (s3[0] + s3[1] + s3[2])/3);
        System.out.println("student 4 average :" + (s4[0] + s4[1] + s4[2])/3);

    }
}
