import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        LocalDate localToday = LocalDate.of(today.get(Calendar.YEAR), today.get(Calendar.MONTH) + 1, today.get(Calendar.DAY_OF_MONTH));
        LocalDate localDob = LocalDate.of(dob.get(Calendar.YEAR), dob.get(Calendar.MONTH) + 1, dob.get(Calendar.DAY_OF_MONTH));
        Period period = Period.between(localDob, localToday);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();


        System.out.println("You are " + years + " years, " + months + " months, " + days + " days old");
        scanner.close();
    }
}
