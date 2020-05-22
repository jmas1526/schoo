import java.util.Scanner;

public class Exercise9_2 {

	public static void main(String[] args) {
		Day a = new Day();
		Day b = new Day(2000);
		Day c = new Day(2001,2);
		Day d = new Day(2002,3,11);
		Day e = new Day(2005,5,23);
		Day f = new Day(e);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(f.toString());
	}

}
