import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SecondToTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        int seconds = value % 60;
        int minutes = (value / 60) % 60;
        int hours = (value / 3600) % 24;

        LocalTime time = LocalTime.of(hours, minutes, seconds);

        System.out.println(time.format(DateTimeFormatter.ofPattern("H:mm:ss")));

    }
}
