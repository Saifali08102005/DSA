//Q. Check is number is palindrome or not
import java.util.Scanner;
import java.math.*;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (isPalindrom(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    public static boolean isPalindrom(int num) {
        int org = num;
        int copy = 0;
        while (org > 0) {
            int last = org % 10;
            copy = (copy * 10) + last;
            org /= 10;
        }
        if (num == copy) {
            return true;
        } else {
            return false;
        }
    }
}
