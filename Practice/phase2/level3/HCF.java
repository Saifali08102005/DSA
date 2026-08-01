
// Find HCF (GCD) of two numbers using loops.
// input - 20 40 output - 20 , highest common divisior
// take two input check are they valid , fining min of them to loop 
// in loop - check common divisior by - if 
 
import java.util.*;

public class HCF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :  ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        findHCF(num1, num2);
    }

    public static void findHCF(int a, int b) {
        int min = 0; // finding max for loop iteration
        int divisior = 1;
        if (a >= 1 && b >= 1) {
            if (a > b) {
                min = b;
            } else {
                min = a;
            }
            // after max - checking hcf
            for (int i = 1; i <= min; i++) {
                if (a % i == 0 && b % i == 0) {
                    divisior = i;
                }
            }
            System.out.println("HCF of " + a + " and " + b + "  : " + divisior);
        } else {
            System.out.println("Invalid Input");
     
        }
    }
}