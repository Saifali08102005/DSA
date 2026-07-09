/*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
 */

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        Butterflyp(n);
    }

    public static void Butterflyp(int n) {
        // first half
        for (int i = 1; i <= n; i++) { // row
                // star
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");

                }
                // space
                for (int l = 1; l <= (n - i) * 2; l++) {
                    System.out.print(" ");
                }
                // star
                for (int m = 1; m <= i; m++) {
                    System.out.print("*");
                }
            
            System.out.println("");
        }
        // reverse
        for (int i = n; i >= 1; i--) { // row
                // star
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                // space
                for (int l = 1; l <= (n - i) * 2; l++) {
                    System.out.print(" ");
                }
                // star
                for (int m = 1; m <= i; m++) {
                    System.out.print("*");
                }
            
            System.out.println("");
        }
    }
}