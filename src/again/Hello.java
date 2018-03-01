package again;

import java.text.DecimalFormat;

public class Hello {
	public static void main(String[] args){
		System.out.println("Hear ye: Important Anncouncement");
		System.out.println("Hello World");
		DecimalFormat df = new DecimalFormat("0.00");
		Long freeMem = Runtime.getRuntime().freeMemory();
		System.out.println(df.format(freeMem/1000000F) + "MB");
		System.out.println("Good Bye");
	}
}
