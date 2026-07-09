// Decimal to Binary conversion.
import java.util.*;
import java.math.*;

public class DectoBin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number : ");
        int num = sc.nextInt();
        System.out.println(DectoBin(num));

    }

    public static int DectoBin(int n) {
        int i = 0;
        int Bin = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 2;
            Bin = Bin + (int) (Math.pow(10, i) * rem);
            i++;
            n /= 2;
        }
        return Bin;
    }
}