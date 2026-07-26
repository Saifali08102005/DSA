
// Take a year and print the corresponding century
//  (e.g., “19th century”, “20th century”) 
/*
take input 
check divide by 100 - store return value in cent
yes - store 
no - store +1 
check cent is between 11th to 13th (cent%100>=11 && cent%100<=13)
no - > use switch 
*/ 
import java.util.*;

public class Century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter year : ");
        int year = sc.nextInt();
        if (year > 0) {
            checkCentury(year);
        } else {
            System.out.println("Invalid year");
        }
    }

    public static void checkCentury(int year) {
        int cent = 0;
        if (year % 100 == 0) { // to check under
            cent = year / 100;
        } else { // if not divisible by 100 201/100 = 2+1 = 3rd cent
            cent = (year / 100) + 1;
        }

        if (cent % 100 <= 13 && cent % 100 >= 11) { // 11th 12th 13th - again module 100 (cent=110)
            System.out.println(cent + "th centuary"); // 110th cent
        } else {
            switch (cent % 10) { // to know last digit
                case 1:
                    System.out.println(cent + "st centuary");
                    break;
                case 2:
                    System.out.println(cent + "nd centuary");
                    break;
                case 3:
                    System.out.println(cent + "rd centuary");
                default:
                    System.out.println(cent + "th centuary");
                    break;
            }
        }
    }
}
