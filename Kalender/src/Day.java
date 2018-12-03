import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * TODO description
 */
public class Day {
	
	private ArrayList<Token> _tokens = new ArrayList<Token>();
	private Datum _date;
	
	public Day(Datum date) {
		_date = date;
	}

	public Datum getDatum() {
		return _date;
	}
	
	public void addToken(Token token) {
		_tokens.add(token);
	}
	
	public void print() {
		if(_tokens.isEmpty()) {
			System.out.println("nothing here");
			return;
		}
		_date.printDate();
		System.out.println("\n");
		for(int i = 0; i < _tokens.size(); i++) {
			_tokens.get(i).print();
		}
		System.out.println("What would you like to do?");
		Scanner scr = new Scanner(System.in);
		String input = scr.nextLine();
		if(input.equals("Weather")) {
			for(Token t: _tokens) {
				if(t.getID().equals("Weather")) {
					t.runFeature();
				}
			}
		}
		if(input.equals("Appointments")) {
			for(Token t: _tokens) {
				if(t.getID().equals("Appointment")) {
					t.runFeature();
				}
			}
		}
	}
}