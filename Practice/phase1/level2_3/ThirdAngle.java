package phase1.level2_3;

// Take two angles of a triangle and compute the third angle.
// Triangle possible - when sum of two angle are less than 180 
import java.util.*;

public class ThirdAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two sides of triangle : ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        checkTria(angle1, angle2);
    }

    public static void checkTria(int angle1, int angle2) {
        if (angle1 > 0 && angle2 > 0) {
            int angle3 = 180 - (angle1 + angle2);
            if (angle3 < 180 && angle3>0) {
                System.out.println("Third side of Triangle : " + angle3);
            } else {
                System.out.println("Sum of two angles must be less than 180°.");
            }
        } else {
            System.out.println("Angle must be greater than 0");
        }
    }
}
