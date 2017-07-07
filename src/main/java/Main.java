import java.time.LocalDate;

/**
 * Created by gubar on 07.07.2017.
 */
public class Main {

    public static final String RED = (char) 27 + "[31m";
    public static final String BLACK = (char) 27 + "[30m";
    public static final String GREEN = (char) 27 + "[32m";

    public static void main(String[] args) {
        LocalDate localDate;
        Calendar calendar;
        if (args.length != 0) {
//            localDate = LocalDate.of(Integer.parseInt(args[0]), Integer.parseInt(args[1]), 1);
            calendar = new Calendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        } else {
//            localDate = LocalDate.now();
//            localDate = localDate.minusDays(localDate.getDayOfMonth()-1);
            calendar = new Calendar();
        }

        calendar.printCalendar();

        /*Year year = Year.of(localDate.getYear());


        int monthLength = localDate.getMonth().length(year.isLeap());
        int startDay = localDate.getDayOfWeek().getValue()-1;

        DayOfWeek day = DayOfWeek.MONDAY;
        for(int i = 0; i < 7; i++){
            System.out.print(day.getDisplayName(TextStyle.SHORT, Locale.forLanguageTag("uk")) + " ");
            day = day.plus(1);
            if(i % 7 == 4){
                System.out.print(RED);
            }
        }
        System.out.println(BLACK);

       for(int i = 0; i < monthLength+startDay; i++){
           if(i >= startDay){
               if(i % 7 == 5){
                   System.out.print(RED);
               }

               if(i % 7 == 0 && i != 0){
                   System.out.println(BLACK);
               }

               if(localDate.equals(LocalDate.now())){
                   System.out.print(GREEN);
               }
               System.out.format("%2d ", localDate.getDayOfMonth());

               localDate = localDate.plusDays(1);


           }
           else{
               System.out.print("   ");
           }



        }*/

    }


}
