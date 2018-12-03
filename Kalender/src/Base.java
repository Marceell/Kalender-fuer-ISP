import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * TODO description
 */
public class Base {

	//toDo
	/* 
	 * Datum aus Tagnummer berechnen
	 * Calendar schön ausgeben
	 * Interface um mit Kalender zu interagieren
	 */
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList(args);
		if (list.contains("Windows")) {
			System.out.println("OS: Windows");
		} else {
			System.out.println("Linux/IOS");
		}
		
		//choose Design
		String design = "";
		if(list.contains("Vorlage")) {
			design = "standard";
		} else {
			design = "custom";
		}
		
		//create Calendar
		Calendar calendar = new Calendar(new Design(design));
		
		//add features
		
		//Weather
		if(list.contains("Wetter")) {
			calendar.enableFeature(new Weather("Weather"));
		}
		if(list.contains("Termine")) {
			calendar.enableFeature(new AppointmentManager("Appointment"));
		}
		/*
		if(list.contains("Feiertage")) {
			calendar.enableFeature(new Holiday("Holiday"));
		} */
				
		//testing
		boolean terminate = false;
		while(terminate == false) {
			System.out.println("enter date as: day, month, year");
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			if(input.isEmpty()) {
				continue;
			}
			if(input.equals("exit")) {
				terminate = true;
				continue;
			}
			String[] data = input.split(",");
			
			calendar.printDay(new Datum(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])));
		}
	}
}