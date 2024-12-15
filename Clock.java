import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Clock {

    //LocalDate - represents a date
    //LocalTime - represents a time
    //LocalDateTime - represents both date and time
    //format.DateTimeFormatter - formatting display of both date and time

    public static void main(String[] args) {
        // Get the current date
        LocalDate date = LocalDate.now();
        System.out.println("Date today is: " + date);//displays the current date

        // Gets the current time
        LocalTime time = LocalTime.now();
        System.out.println("Time now is: " + time);//displays the current time

        // Gets both the date and time 
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and time now is: " + dateTime);//displays the current date

        // Gets both the date and time much more easier to understand
        System.out.println("Before formatting: " + dateTime);
        DateTimeFormatter formatOBJ = DateTimeFormatter.ofPattern("MM-dd-yyyy E/HH:mm:ss"); //E is the day
        String formatted = dateTime.format(formatOBJ);//gets the value from "LocalDateTime" (dateTime) to format into "FormatOBJ"
        System.out.println("The formatted date and time today is: " + formatted);

    }
}
