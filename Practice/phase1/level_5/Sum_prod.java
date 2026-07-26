// Take an integer (1–9999) and check if the sum of its digits is 
// greater than the product of its digits. 
/*
    check input num range
    by while - take digits from input num 
    also sum & product 
    compare sum & compare 
*/

import java.util.Scanner;

public class Sum_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between (1-9999) : ");
        int num = sc.nextInt();
        checkGreater(num);
    }

    public static void checkGreater(int num) {
        int sum = 0;
        int product = 1;
        int cpy = num;
        int digit = 0;
        if (num >= 1 && num <=9999) {
            while (cpy > 0) {
                digit = cpy % 10;
                cpy /= 10;
                sum += digit;
                product *= digit;
            }
            if (sum > product) {
                System.out.println("Sum of digits is greater than the product of digits.");
            } else {
                System.out.println("Sum of digits is not greater than the product of digits.");
            }
        } else {
            System.out.println("Number is not in range..");
        }
    }
}
