// Take a day number (1–7) and print the corresponding day name.
public class DayName {
    public static void main(String[] args) {
        DayofWeek(0);
        DayofWeek(5);
        DayofWeek(7);
    }

    public static void DayofWeek(int day) {
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Monday");
            }
            if (day == 2) {
                System.out.println("Tuesday");
            }
            if (day == 3) {
                System.out.println("Wednesday");
            }
            if (day == 4) {
                System.out.println("Thirsday");
            }
            if (day == 5) {
                System.out.println("Friday");
            }
            if (day == 6) {
                System.out.println("Saturday");
            }
            if (day == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Invalid Input");
        }
        ;
    }
}