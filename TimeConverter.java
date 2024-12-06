//William Alvey

public class TimeConverter {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM; // True if AM, false if PM

    // Default constructor
    public TimeConverter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true; // Default to AM
    }

    // Parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) throws TimeException {
        updateTime(hours, minutes, seconds);
    }

    // Accessors
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isNotPM() {
        return notPM;
    }

    // Mutators with validation
    public void setHours(int hours) throws TimeException {
        if (hours < 0 || hours > 23) throw new TimeException();
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws TimeException {
        if (minutes < 0 || minutes > 59) throw new TimeException();
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws TimeException {
        if (seconds < 0 || seconds > 59) throw new TimeException();
        this.seconds = seconds;
    }

    // Method to update time using hours, minutes, and seconds
    public void updateTime(int hours, int minutes, int seconds) throws TimeException {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            throw new TimeException();
        }
        this.hours = (hours % 12 == 0) ? 12 : hours % 12; // Converts 24-hour to 12-hour format
        this.minutes = minutes;
        this.seconds = seconds;
        this.notPM = hours < 12; // Sets AM if hours < 12, otherwise PM
    }

    //  updateTime method to parse time from a String
    public void updateTime(String time) throws TimeException {
        try {
            String[] timeParts = time.split(":");
            int parsedHours = Integer.parseInt(timeParts[0]);
            int parsedMinutes = Integer.parseInt(timeParts[1]);
            int parsedSeconds = Integer.parseInt(timeParts[2]);
            updateTime(parsedHours, parsedMinutes, parsedSeconds);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new TimeException("EXCEPTION: Invalid format entered");
        }
    }

    // Method to display the time in 12-hour format
    public void displayTime() {
        System.out.printf("12-hour clock time → %02d:%02d:%02d %s\n", hours, minutes, seconds, notPM ? "AM" : "PM");
    }
}
