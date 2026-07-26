// Print the product of digits of a given number.
// input - 123 
// output - 6

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        prod(num);
    }   
    public static void prod(int num) {
        int prodct=1;
        int digit=0;
        int cpy=num;
        while (cpy>0) {
            digit=cpy%10;
            cpy/=10;
            prodct*=digit;
        }
        System.out.println("Product of number "+num+" : "+prodct);
    }
}
