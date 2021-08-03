import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthDAYCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("When is your birthday (mm/dd/yyyy)? ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate curDate = LocalDate.now();
        String date = birthDate.format(formatter);
        System.out.println("Your birthday was on a " + birthDate.getDayOfWeek());
        int yearsUntilCurrent = curDate.getYear() - birthDate.getYear();
        LocalDate nextBirthDay = birthDate.plusYears(yearsUntilCurrent);
        if(nextBirthDay.compareTo(curDate) < 0) {
            nextBirthDay = nextBirthDay.plusYears(1);
        }
        System.out.println("This year, your birthday is on a " + nextBirthDay.getDayOfWeek());
        System.out.println("Since today is " + date + ", there's only " + curDate.datesUntil(nextBirthDay).toArray().length + " day until your next birthday!");
        System.out.println("Bet you're excited about turning " + (yearsUntilCurrent+1));
    }
}
