/**
 * Created by gubar on 07.07.2017.
 */
public class Main {

    /**
     * @param args - year month
     */
    public static void main(String[] args) {
        Calendar calendar;
        if (args.length != 0) {
            calendar = new Calendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
            calendar = new Calendar();
        }
        calendar.printCalendar();
    }
}
