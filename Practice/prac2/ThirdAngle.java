
// Take two angles of a triangle and compute the third angle.
import java.util.*;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sides of triangle : ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        checkTria(side1, side2);
    }

    public static void checkTria(int side1, int side2) {
        if (side1 > 0 && side2 > 0) {
            int side3 = 180 - (side1 + side2);
            if (side3 < 180 && side3!=0) {
                System.out.println("Third side of Triangle : " + side3);
            } else {
                System.out.println("Sum of two angles must be less than 180°.");
            }
        } else {
            System.out.println("Angle must be greater than 0");
        }
    }
}
