import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by gubar on 07.07.2017.
 */
public class Calendar {
    public static final String RED = (char) 27 + "[31m";
    public static final String BLACK = (char) 27 + "[30m";
    public static final String GREEN = (char) 27 + "[32m";

    private LocalDate localDate;

    private int monthLength;
    private int startDay;

    public Calendar() {
        this(LocalDate.now().getYear(), LocalDate.now().getMonthValue());
    }

    public Calendar(int year, int month) {
        localDate = LocalDate.of(year, month, 1);
        monthLength = localDate.lengthOfMonth();
        startDay = localDate.getDayOfWeek().getValue() - 1;
    }

    private void printDayNames() {
        DayOfWeek day = DayOfWeek.MONDAY;
        for (int i = 0; i < 7; i++) {
            System.out.print(day.getDisplayName(TextStyle.SHORT, Locale.forLanguageTag("uk")) + " ");
            day = day.plus(1);
            if (day.equals(DayOfWeek.SATURDAY)) {
                System.out.print(RED);
            }
        }
        System.out.println(BLACK);
    }

    private void printDates() {
        for (int i = 0; i < monthLength + startDay; i++) {
            if (i >= startDay) {
                setColor(i);
                System.out.format("%2d ", localDate.getDayOfMonth());
                localDate = localDate.plusDays(1);
            } else {
                System.out.print("   ");
            }
        }
    }

    private void isToday() {
        if (localDate.equals(LocalDate.now())) {
            System.out.print(GREEN);
        }
    }

    private void setColor(int i) {
        if (localDate.getDayOfWeek().equals(DayOfWeek.SATURDAY) || localDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            System.out.print(RED);
        } else if (localDate.getDayOfWeek().equals(DayOfWeek.MONDAY)
                && i != 0) {
            System.out.println(BLACK);
        }
        isToday();
    }

    public void printCalendar() {
        printDayNames();
        printDates();
    }
}
