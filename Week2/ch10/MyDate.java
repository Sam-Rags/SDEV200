import java.util.GregorianCalendar;
import java.util.Calendar;
import java.time.LocalDate;


public class MyDate {
    //Data fields
    private int year;
    private int month; // 0 based, i.e. January is 0
    private int day;

    //no-arg constructor
    public MyDate() {
        LocalDate currentDate = LocalDate.now();
        day = currentDate.getDayOfMonth();
        month = currentDate.getMonthValue();
        year = currentDate.getYear();
    }

    //Elapsed time since Midnight, January 1, 1970 in milliseconds
    public MyDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(calendar.MONTH)+1;
        this.year = calendar.get(calendar.YEAR);
    }

    //A constructor with specified year, month, day
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    //all setter and getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(calendar.MONTH)+1;
        this.year = calendar.get(calendar.YEAR);
    }




}

