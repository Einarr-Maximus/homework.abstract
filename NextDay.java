import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class NextDay {

    public static void main(String[] args) {

        /* Имеются три числа - день, месяц, год. Вывести в виде трех
        чисел дату следующего дня. */

       /* Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println(date);*/

        /*calendar.add(Calendar.DAY_OF_MONTH, 1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1; //0 - January, 11 - December
        int year = calendar.get(Calendar.YEAR);

        System.out.println("Дата следующего дня " + day + " " + month + " " + year);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println("Дата следующего дня " + dateFormat.format(calendar.getTime()));*/

        /*
        31.12.0000
        31.01.0000
        30.04.0000
        28.02.0004
        29.02.0004
        00.00.0000
         */

        Random random = new Random();
        int day = random.nextInt(31) + 1;
        int month = random.nextInt(12) + 1;
        int year = random.nextInt(10000);
        System.out.println("Дата " + day + " " + month + " " + year);

        if (month == 12 && day == 31)
        {
            day = 1;
            month = 1;
            year ++;
        }
        else if (month == 2 && day == 28 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
        {
            day ++;
            //month ++;
        }
        else if (month == 2 && (day == 28 || (day == 29 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))))
        {
            day = 1;
            month ++;
        }
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31)
        {
            day = 1;
            month ++;
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30)
        {
            day = 1;
            month++;
        }
        else
            day ++;

        if (day >= 30 && month == 2)
            System.out.println("Нет такой даты");
        else
            System.out.println("Дата следующего дня " + day + " " + month + " " + year);

    }
}
