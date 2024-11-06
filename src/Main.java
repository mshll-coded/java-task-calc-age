import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double MS_A_YEAR = 31557600000L;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter birth month: ");
        int month = scanner.nextInt() - 1;
        System.out.print("Enter birth day: ");
        int day = scanner.nextInt();

        Calendar today = Calendar.getInstance();
        Calendar dob = Calendar.getInstance();
        dob.set(year, month, day);
        double ageMs = today.getTime().getTime() - dob.getTime().getTime();
        double age = ageMs / MS_A_YEAR;

        System.out.format("You are %.2f years old", age);
    }
}
