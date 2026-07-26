
// Print all even numbers between 1 and 100.
// Print the sum of all even numbers up to n. 
//  Print the sum of all odd numbers up to n
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        even(num);
        odd(num);
    }

    public static void even(int num) {
        int sum = 0;
        System.out.println("Even number from 1 to " + num + " : ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Sum of even number form 1 to " + num + " : "+sum);
    }

    public static void odd(int num) {
        int sum = 0;
        System.out.println("Odd number from 1 to " + num + " : ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }

        }
        System.out.println("Sum of odd number form 1 to " + num + " : "+sum);
    }
}
