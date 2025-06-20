public class TestMyDate {
	
	public static void main(String[] args) {
		//no-arg contructor
		MyDate myDate = new MyDate();
		System.out.println("Current Date: " + myDate.getMonth() + "/" + myDate.getDay() + "/" + myDate.getYear());
		
		//A constructor with a specified year, month and day
		MyDate myDate1 = new MyDate(12, 5, 2020);
		System.out.println("Date: " + myDate1.getMonth() + "/" + myDate1.getDay() + "/" + myDate1.getYear());
		
		//elapsed time
		MyDate myDate2 = new MyDate(34355555133101L);
		System.out.println("elapse time is Date: " + myDate2.getMonth() + "/" + myDate2.getDay() + "/" + myDate2.getYear());
		
		//setTime
		myDate2.setDate(0L);
		System.out.println("myDate set at Date: " + myDate2.getDay() + "/"+myDate2.getMonth() + "/"+myDate2.getYear());
		
	}
}