package RECURSION.pattern;

public class Number {
    public static void main(String[] args) {
        pattern(0 , 0 , 1);
    }
    static void pattern(int i , int j , int count) {
        if (i > 3) {
            return;
        }
        if (j < 4) {
            if (j <= i) {
                System.out.print(count + " ");
                pattern(i, j + 1, count + 1);
            } else {
                System.out.print(0 + " ");
                pattern(i, j + 1, count);
            }

        } else {
            System.out.println();
            pattern(i + 1, 0, count);
        }
    }
}
