import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO description
 */
public class Calendar {
	
	private Design _design;
	private ArrayList<Day> _calendar = new ArrayList<Day>(365);
	
	public Calendar(Design design) {
		_design = design;
		initialize();
	}
	
	public void initialize() {
		int dayCount = 31;
		for(int k = 1; k <= 12; k++) {
			dayCount = 31;
			if(k == 2) {
				dayCount = 28;
			}
			if(k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12) {
				dayCount = 30;
			}
			for(int i = 1; i <= dayCount; i++) {
				_calendar.add(new Day(new Datum(i, k, 2018)));
			}
		}
	}
	
	//enable a token for every day, e.g. Weather
	public void enableFeature(Token t) {
		for(int i = 0; i < _calendar.size(); i++) {
			_calendar.get(i).addToken(t);
		}
	}
	
	//add token to a specific day
	public void addFeature(Token t, int day) {
		_calendar.get(day).addToken(t);
	}
	
	public void printMonth(int month) {
		switch (month) {
		
		case 1:  for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
	 	break;
		case 2: for(int i = 1; i <= 28; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 3: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 4: for(int i = 1; i <= 30; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 5: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}	
		}
		System.out.println("\n");
		break;
		case 6: for(int i = 1; i <= 30; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 7: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 8: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 9: for(int i = 1; i <= 30; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 10: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 11: for(int i = 1; i <= 30; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		case 12: for(int i = 1; i <= 31; i++) {
			if(i < 10) {
				System.out.print("0" + i + "." + month + ".2018" + "   ");
			} else {
				System.out.print(i + "." + month + ".2018" + "   ");
			}
		}
		System.out.println("\n");
		break;
		
		default: System.out.println("invalid Month");
		}
	}
	
	public void printDay(Datum date) {
		for(Day d : _calendar) {
			if(d.getDatum().same(date)) {
				d.print();
			}
		}
	}
}