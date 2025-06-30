import daysAndDates.DaysOfWeek; // correct mispelling & capitalization error in 'import' keyword, syntax error

public class TestDaysOfWeek {

	public static void main(String[] args) {
		System.out.println("Days Of week: ");
		for (int i = 1;i < 8;i++) { // begin iteration at 1 to avoid 0 switch statement that does nothing, logic error
			System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.DayOfWeekStr(i) ); // add semicolon to terminate statement, syntax error
		}

	}

}
