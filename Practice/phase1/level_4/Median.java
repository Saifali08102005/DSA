
// Take three numbers and print the median value 
// (neither maximum nor minimum).
//  compare - both and set median , by >= <=
// = equal to because 4 4 3 this kind of quesiton 
import java.util.*;

public class Median {
    public static void main(String[] args) {
        findMedian(4, 6, 5);
        findMedian(5, 8, 9);
        findMedian(4, 4, 3);
    }

    public static void findMedian(int a, int b, int c) {
        int median = 0;
        if (a <= b && a >= c) {
            median = a;
            System.out.println("step 1 ");
        } else if (a >= b && a <= c) {
            median = a;
            System.out.println("step 2");
        }else if(b>=c && b<=a){
            median=b;
            System.out.println("step 3");
        }else if(b<=c && b>=a){
            median=b;
            System.out.println("step 4");
        }else{
            median=c;
            System.out.println("step 5");
        }
        System.out.println("Meidan : " + median);
    }
}
