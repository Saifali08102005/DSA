// Take a password string and check basic rules 
// (length ≥ 8 and contains at least one digit).
/*
    first - check lenght of pswrd (pswrd.length()>7)
     then - check digit in range of Asci (47 to 58)
     track each char then convert into asci 
     then compare
 */
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password (minimum 8 characters and at least one digit): ");
        String pswrd = sc.next();
        checkpswrd(pswrd);
    }
    public static void checkpswrd(String pswrd) {
        int num=0;
        if(pswrd.length()>7){
            for(int i=0;i<pswrd.length();i++){
                char ch = pswrd.charAt(i);
                num = ch;
                if(num>47 && num<58){
                    System.out.println("Valid Password");
                    return;
                }
            }
            System.out.println("Invalid Password - required (at least 1 digit)");
        }else{
            System.out.println("Invalid Password");
            System.out.println("required - minimum 8 lenght.");
        }
    }

}
