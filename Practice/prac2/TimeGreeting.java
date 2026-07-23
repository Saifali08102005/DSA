// Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”,
// “Good Evening”, or “Good Night”
/*
✅ 5–11 → Good Morning
✅ 12–16 → Good Afternoon
✅ 17–20 → Good Evening
✅ Baaki (0–4 aur 21–23) → Good Night
*/
public class TimeGreeting {
    public static void main(String[] args) {
        greeting(24);
        greeting(15);
        greeting(20);
        greeting(21);
    }

    public static void greeting(int hour) {
        if (hour >= 0 && hour <= 23) {
            if (hour >= 5 && hour <= 11) {
                System.out.println("Good Morning");
            } else if (hour >= 12 && hour <= 16) {
                System.out.println("Good Afternoon");
            } else if (hour >= 17 && hour <= 20) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}