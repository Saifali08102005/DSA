package StarPattern;
/*
        * * * * *
        *       *
        *       *
        * * * * *
*/

import java.util.Scanner;

public class Hollow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        Hollowp(n);
    }

    public static void Hollowp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}