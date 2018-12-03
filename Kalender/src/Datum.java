/**
 * TODO description
 */
public class Datum {
	
	private int _day;
	private int _month;
	private int _year;
	
	public Datum(int day, int month, int year) {
		_day = day;
		_month = month;
		_year = year;
	}
	
	public int getDay() {
		return _day;
	}
	
	public int getMonth() {
		return _month;
	}
	
	public int getYear() {
		return _year;
	}
	
	public boolean same(Datum date) {
		if(date.getDay() == _day && date.getMonth() == _month && date.getYear() == _year) {
			return true;
		}
		return false;
	}
	
	public void printDate() {
		System.out.println(_day + "." + _month + "." + _year);
	}

}