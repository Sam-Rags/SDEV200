public class CurrentTime {
    public static void main(String[] args) {
        // Obtain total Milliseconds since Midnight Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis(); 

        // Obtain total SECONDS since Midnight Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain total minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        //Display results
        System.out.println("Current time is " + currentHour + ":" + 
        currentMinute + ":" + currentSecond + " GMT");

    }    
}
