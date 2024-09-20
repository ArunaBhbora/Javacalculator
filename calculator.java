import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Enter your birth date (DD/MM/YYYY): ");
            String input = scanner.nextLine();
            
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate currentDate = LocalDate.now();
            
            Period age = Period.between(birthDate, currentDate);
            
            System.out.printf("You are %d years, %d months, and %d days old.",
                    age.getYears(), age.getMonths(), age.getDays());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
        } finally {
            scanner.close();
        }
    }
}