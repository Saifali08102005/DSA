// Take three numbers and
//  check if they can form a Pythagorean triplet. 
/*
    find large number,
    add other num ,
    take square of added num ,
    compare with third max num after square of max 
    if same - for pythagorean triplet 
    else - not form pythagorean triplet
*/

import java.util.*;

public class Pythagouras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.println(" Enter Number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter Number 3 : ");
        int c = sc.nextInt();
        checkPyth(a, b, c);
    }

    public static void checkPyth(int a, int b, int c) {
        int max = 0;
        int other1 = 0;
        int other2 = 0;
        int side = 0;
        if (a != b && b != c && a != c) { // condition for all distinct value
            // finding largest num & other values
            if (a > b && a > c) {
                max = a;
                other1 = b;
                other2 = c;
            } else if (b > c && b > a) {
                max = b;
                other1 = a;
                other2 = c;
            } else {
                max = c;
                other1 = a;
                other2 = b;
            }
            // squaring other
            side =(other1*other1) + (other2*other2);
            System.out.println("Sum other side : " + side);
            System.out.println("largest value : " + max);
            max = (max*max);
            System.out.println("largest value after squaring : " + max);
            if (side == max) { // checking are the same
                System.out.println("Form Pythagorean triplet");
            } else {
                System.out.println("Not form Pythagorean triplet");
            }
        } else {
            System.out.println("Three number need different.");
        }

    }
}
