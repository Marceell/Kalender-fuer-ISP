import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * TODO description
 */
public class Weather extends Token{

	public Weather(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runFeature() {
		showWeather();
	}
	
	@Override
	public void print() {
		System.out.println("Weather");;
	}
	
	public void showWeather() {
		Desktop d = Desktop.getDesktop();
		try {
			d.browse(new URI("https://www.wetter.de/"));
		} catch (IOException e) {
			System.out.println("IO exception");
		} catch (URISyntaxException e) {
			System.out.println("URI exception");
		}
	}
	
}