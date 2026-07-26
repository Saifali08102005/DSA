// Print the factorial of a given number. 
/*
    lopp - i=2 to i<=n
        fact*=i
*/
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        fact(num);
    }

    public static void fact(int n) {
        int factr = 1;
        int cpy = n;
        if (n == 0 || n == 1) {
            System.out.println("Factorial : " + factr);
        } else {
            for (int i = 2; i <= n; i++) {
                factr *= i;
            }
            System.out.println("Factorial : " + factr);
        }
    }
}
