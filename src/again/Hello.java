package again;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Hello {
	public static void main(String[] args){
		System.out.println("Hear ye: Important Anncouncement");
		System.out.println("Hello World");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		System.out.println("Good Bye");
	}
}
