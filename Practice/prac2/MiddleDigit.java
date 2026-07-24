
// Take a 3-digit number and determine if the middle 
// digit is the largest, smallest, or neither.
/*
%10 -> Get digit
/10 -> Remove digit
Compare middle
*/
import java.util.*;

public class MiddleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number : ");
        int num = sc.nextInt();
        if (num > 99 && num < 1000) {
            intoDigit(num);
        } else {
            System.out.println("Enter 3 digit num.");
        }

    }

    public static void intoDigit(int num) {
        int cpy = num;
        int lastdig = cpy % 10;
        cpy /= 10;
        int middig = cpy % 10;
        cpy /= 10;
        int firsdig = cpy % 10;
        cpy /= 10;

        checkMiddleDig(firsdig, middig, lastdig);
    }

    public static void checkMiddleDig(int a, int b, int c) {
        if (b > a && b > c) {
            System.out.println("Middle digit is largest.");
        } else if (b < a && b < c) {
            System.out.println("Middle digit is smallest");
        } else {
            System.out.println("Middle digit is not smallest nor largest");
        }
    }
}
