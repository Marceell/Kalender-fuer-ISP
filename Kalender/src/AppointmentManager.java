import java.util.ArrayList;
import java.util.Scanner;

/**
 * TODO description
 */
public class AppointmentManager extends Token {

	private ArrayList<Appointment> _ap = new ArrayList<Appointment>();
	
	public AppointmentManager(String s) {
		super(s);
	}

	@Override
	public void runFeature() {
		boolean terminate = false;
		Scanner sc = new Scanner(System.in);
		while(terminate == false) {
			System.out.println("show appointments: s \nadd appointment: a \ndelete appointment: d \nexit AppointmentManager: e");
			char input = sc.next().charAt(0);
			if(input == 'e') {
				terminate = true;
				continue;
			} else if(input == 's') {
				if(_ap.isEmpty()) {
					System.out.println("You have no appointments today. \n");
				} else {
					for(Appointment a : _ap) {
						a.print();
					}
				}
			} else {
			}			
			if(input == 'a') {
				System.out.println("please enter an appointment");
				sc = new Scanner(System.in);
				String ap = sc.nextLine();
				_ap.add(new Appointment(ap));
				System.out.println("Added appointment: " + ap);
			}

		}
	}

	@Override
	public void print() {
		System.out.println("Appointments");
	}

}