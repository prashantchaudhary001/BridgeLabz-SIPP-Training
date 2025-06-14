import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // month
        int d = sc.nextInt(); // day
        int y = sc.nextInt(); // year

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dow = (d + x + 31*m0/12) % 7;

        System.out.println("Day of week: " + dow); 
    }
}
