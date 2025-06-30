package daysAndDates; // Insert semicolon ; to close statement, syntax error

public class DaysOfWeek {
	public static String DayOfWeekStr(int NumberOfDay) {
		String dayStr = ""; // Insert semicolon ; to close statement, syntax error
		switch (NumberOfDay) {
			case 1:
				dayStr = "Sunday";
				break;
			case 2:
				dayStr = "Monday";
				break;
			case 3:
				dayStr = "Tuesday";  // Insert semicolon ; to close statement, syntax error
				break;
			case 4:
				dayStr = "Wednesday";
				break; // insert break keyword to terminate switch statement, syntax error
			case 5:
				dayStr = "Thursday";
				break;
			case 6:
				dayStr = "Friday"; // correct case 6 to 'Friday' from 'Thursday' // logic error
				break;
			case 7:
				dayStr = "Saturday";
				break;
			default:
				dayStr = "Here comes the weekend!"; // added default handling for input exceptions, potentially a logic error
		}
		return dayStr; // add return statement, syntax error
	}
}
