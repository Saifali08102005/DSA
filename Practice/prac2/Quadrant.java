
// Take coordinates (x, y) and determine which quadrant the point lies in.
import java.util.*;
/*
Check Origin
Check X/Y axis
Otherwise check Quadrant
*/
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X axis : ");
        int x = sc.nextInt();
        System.out.println("Enter Y axis  :");
        int y = sc.nextInt();
        findQuadrant(x, y);
    }

    public static void findQuadrant(int x, int y) {
        if (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Quadrant 1");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrant 2");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrant 3");
            } else { // x>0 && y<0
                System.out.println("Quadrant 4");
            }
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("on Y axis");
        } else {
            System.out.println("on X axis");
        }
    }
}
