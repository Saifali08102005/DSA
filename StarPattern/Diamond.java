
/*
      *
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      *
*/
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        Diamondp(n);
    }

    public static void Diamondp(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //Reverse
        for (int i = n; i >= 1; i--) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
