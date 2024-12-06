//william alvey
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Ship {
    private String name;
    private LocalDate launchDate;
    private static final LocalDate DEFAULT_DATE = LocalDate.of(1990, 1, 1);

    // constructor
    public Ship(String name, String launchDate) {
        this.name = name;
        this.launchDate = validateLaunchDate(launchDate);
    }

    // method to validate and reset launch date
    private LocalDate validateLaunchDate(String launchDateInput) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate parsedDate = LocalDate.parse(launchDateInput, formatter);

            //  if date is before 1990
            if (parsedDate.isBefore(DEFAULT_DATE)) {
                System.out.println("Error: Launch date prior to 1990. Resetting " + name + "'s launch date to the default 01/01/1990.");
                return DEFAULT_DATE;
            }
            return parsedDate;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Setting launch date to default 01/01/1990.");
            return DEFAULT_DATE;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    // overridden toString for basic details
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
