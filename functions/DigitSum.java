// Q . Write a Java method to compute the sum of the digits in an integer
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number with at least two digits : ");
        int num = sc.nextInt();
        System.out.println("Sum of " + num + " each digits : " + DigSum(num));

    }

    public static int DigSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}