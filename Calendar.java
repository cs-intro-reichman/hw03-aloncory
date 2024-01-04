/** 
 * Prints the calendar of a given year, which is recieved as a command-line argument.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till the last day of the given year, inclusive.
	    // Prints each date in the given year in format of dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
		int currentYear = Integer.parseInt(args[0]); // Gets a year
	 	while (year < currentYear) {
	 		advance();
        }
		while (year == currentYear) {
			System.out.println(dayOfMonth + "/" + month + "/" + year + ((dayOfWeek == 1) ? " Sunday" : ""));
			advance();
		}
	}
	
	// Advances the date (day, month, year) and the day-of-the-week.
	// If the month changes, sets the number of days in this month.
	// Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	private static void advance() {
		dayOfWeek = ((dayOfWeek == 7) ? 1 : dayOfWeek + 1);
		if (dayOfMonth == nDaysInMonth(month, year)) {
			dayOfMonth = 1;
			if (month == 12) {
				year++;
				month = 1;
			} else {
				month++;
			}
		} else {
			dayOfMonth++;
		}
	} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			} else {
				if (year % 400 == 0) {
					return true;
				}
			}
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 2:
				return (isLeapYear(year) ? 29 : 28);
			case 4:
				return 30;
			case 6:
				return 30;	
			case 9:
				return 30;
			case 11:
				return 30;
			default:
				return 31;
		}
	}
}
