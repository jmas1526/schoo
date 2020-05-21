
public class Q09_1 {

	public static void main(String[] args) {
		
		Human[] initHuman = { 	new Human("i1", 1, 1.1, 5, "A"),
								new Human("i2", 2, 1.2, 10, "B"),
								new Human("i3", 3, 1.3, 15, "O"),
							 };
		Human[] subsHuman = new Human[3];
		subsHuman[0] = new Human("s1", 25, 1.8, 65, "C");
		subsHuman[1] = new Human("s2", 26, 1.9, 65, "D");
		subsHuman[2] = new Human("s3", 27, 1.7, 65, "CD");
		
		for(Human h : initHuman) {
			h.printData();
			System.out.println();
		}
		System.out.println();
		for(Human h : subsHuman) {
			h.printData();
			System.out.println();
		}

	}

}
