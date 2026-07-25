// Take electricity units consumed 
// and calculate the bill as per slabs (using if-else)
import java.util.Scanner;

public class BillUnit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter unit of use electricity : ");
    int num = sc.nextInt();
    if(num>0){
        calculateBill(num);
    }else{
        System.out.println("Number must be greater than 0.");
    }

   } 
   public static void calculateBill(int num) {
    int bill;
        if(num>0 && num<=100){
            bill=num*8;
        }else if(num>100 && num<=200){
            bill=num*12;
        }else if(num>200 && num<=300){
            bill=num*16;
        }else{
            bill=num*20;
        }
        System.out.println("Total bill : "+bill);
   }
}
