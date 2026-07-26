// Print the sum of first n natural numbers.
import java.util.*;
public class sumrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        sum(num);
    }
    public static void sum(int num) {
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of number range 1 to "+num+" : "+sum);
    }
}
