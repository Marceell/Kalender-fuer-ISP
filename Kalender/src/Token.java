/**
 * TODO description
 */
public abstract class Token {
	
	private String _id;
	
	public Token(String s) {
		_id = s;
	}
	
	public String getID() {
		return _id;
	}
	
	public void setID(String s) {
		_id = s;
	}
	
	public abstract void runFeature();
	
	public abstract void print();
}