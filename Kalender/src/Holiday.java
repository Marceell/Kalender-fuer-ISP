/**
 * TODO description
 */
public class Holiday extends Token{
	
	public Holiday(String s) {
		super(s);
	}

	@Override
	public void runFeature() {
		System.out.println("Today is a Holiday!");
	}
	
	@Override
	public void print() {
		System.out.println("Holiday");
	}

}